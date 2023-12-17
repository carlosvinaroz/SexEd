package com.example.sexed.diseases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sexed.databinding.FragmentGonorrheaBinding

/**
 * A simple [Fragment] subclass.
 * Use the [GonorrheaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class GonorrheaFragment : Fragment() {
    private var _binding: FragmentGonorrheaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentGonorrheaBinding.inflate(inflater, container, false)
        return binding.root
    }
}