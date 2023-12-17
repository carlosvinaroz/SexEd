package com.example.sexed.diseases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.ViewModelProvider
import com.example.sexed.R


class DiseasesSectionsFragment : Fragment() {
    private lateinit var viewModel: SharedViewModel
    private lateinit var diseasesSectionTitleTextView: TextView
    private lateinit var diseasesSectionDescriptionTextView: TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inicializa el ViewModel
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)

        // Infla el diseño de este fragmento
        val view = inflater.inflate(R.layout.fragment_diseases_sections, container, false)

        // Encuentra el TextView por su ID
        diseasesSectionTitleTextView = view.findViewById(R.id.diseasesSectionTitleTextView)
        diseasesSectionDescriptionTextView = view.findViewById(R.id.diseasesSectionDescriptionTextView)

        // Observa el LiveData y actualiza la interfaz de usuario en consecuencia
        viewModel.selectedButton.observe(viewLifecycleOwner, { selectedButton ->
            updateUI(selectedButton)
        })

        return view
    }

    private fun updateUI(selectedButton: String) {
        // Actualiza la interfaz de usuario según el botón seleccionado
        // Puedes tener lógica diferente para cada botón
        when (selectedButton) {
            "clamidia" -> {
                // Actualiza la interfaz para la sección de Clamidia
                diseasesSectionTitleTextView.text = "@string/clamidia"
                diseasesSectionDescriptionTextView.text = "Prueba fsdfafsdf"
            }
            "gorronea" -> {
                // Actualiza la interfaz para la sección de Gorronea
                diseasesSectionTitleTextView.text = "@string/gonorrea"
                diseasesSectionDescriptionTextView.text = "Pruebaaaaaaaaaaaa"
            }
            // Agrega más casos según sea necesario
        }
    }
}

/*
/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class DiseasesSectionsFragment : Fragment() {

    private lateinit var _binding: FragmentDiseasesSectionsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = FragmentDiseasesSectionsBinding.inflate(layoutInflater)
        setContentView(_binding.root)

        val adapter=ViewPagerAdapter(supportFragmentManager)

        adapter.addFragment(DiseasesSectionOne(), "@string/sectionOne")
        adapter.addFragment(DiseasesSectionSecond(), "@string/sectionSecond")
        adapter.addFragment(DiseasesSectionThird(), "@string/sectionThird")
        adapter.addFragment(DiseasesSectionFourth(), "@string/sectionFourth")

        _binding.diseasesSectionsViewPager.adapter=adapter
        _binding.diseasesSectionsTabLayout.setupWithViewPager(_binding.diseasesSectionsViewPager)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentFirstBinding.inflate(inflater, container, false)
        return binding.root
    }
}*/