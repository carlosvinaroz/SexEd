package com.example.sexed.diseases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sexed.databinding.FragmentChlamydiaBinding

/**
 * A simple [Fragment] subclass.
 * Use the [ChlamydiaFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ChlamydiaFragment : Fragment() {
    private var _binding: FragmentChlamydiaBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentChlamydiaBinding.inflate(inflater, container, false)
        return binding.root
    }
}