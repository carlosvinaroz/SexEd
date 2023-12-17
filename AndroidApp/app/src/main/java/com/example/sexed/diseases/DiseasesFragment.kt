package com.example.sexed.diseases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sexed.R
import com.example.sexed.databinding.FragmentDiseasesBinding


class DiseasesFragment : Fragment() {
    private var _binding: FragmentDiseasesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDiseasesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.chlamydiaButton.setOnClickListener {
            findNavController().navigate(R.id.action_DiseasesFragment_to_ChlamydiaFragment)
        }

        binding.gonorrheaButton.setOnClickListener {
            findNavController().navigate(R.id.action_DiseasesFragment_to_GonorrheaFragment)
        }

        binding.vphButton.setOnClickListener {
            findNavController().navigate(R.id.action_DiseasesFragment_to_VPHFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


/*
/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class DiseasesFragment : Fragment() {

    private var _binding: FragmentDiseasesBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentDiseasesBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.chlamydiaButton.setOnClickListener {
            findNavController().navigate(R.id.action_DiseasesFragment_to_DiseasesSectionsFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }*/
