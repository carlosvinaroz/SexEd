package com.example.sexed.diseases

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sexed.databinding.FragmentVPHBinding

/**
 * A simple [Fragment] subclass.
 * Use the [VPHFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class VPHFragment : Fragment() {
    private var _binding: FragmentVPHBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentVPHBinding.inflate(inflater, container, false)
        return binding.root
    }
}