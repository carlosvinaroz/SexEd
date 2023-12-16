package com.example.sexed

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SexualityFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SexualityFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_sexuality, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Configurar el comportamiento del botón
        val btnHygiene = view.findViewById<Button>(R.id.buttonHygiene)
        val btnPositiveRelations = view.findViewById<Button>(R.id.buttonPositiveRelations)
        val btnCondom = view.findViewById<Button>(R.id.buttonPreservative)
        val btnPills = view.findViewById<Button>(R.id.buttonPills)
        btnHygiene.setOnClickListener {
            // Aquí puedes agregar el código para navegar a otro fragmento
            // Por ejemplo, utilizando el NavController
            findNavController().navigate(R.id.action_SexualityFragment_to_HygieneFragment)
        }

        btnPositiveRelations.setOnClickListener {
            // Aquí puedes agregar el código para navegar a otro fragmento
            // Por ejemplo, utilizando el NavController
            findNavController().navigate(R.id.action_SexualityFragment_to_HygieneFragment)
        }

        btnCondom.setOnClickListener {
            // Aquí puedes agregar el código para navegar a otro fragmento
            // Por ejemplo, utilizando el NavController
            findNavController().navigate(R.id.action_SexualityFragment_to_HygieneFragment)
        }

        btnPills.setOnClickListener {
            // Aquí puedes agregar el código para navegar a otro fragmento
            // Por ejemplo, utilizando el NavController
            findNavController().navigate(R.id.action_SexualityFragment_to_HygieneFragment)
        }
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment DiseasesFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            DiseasesFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}