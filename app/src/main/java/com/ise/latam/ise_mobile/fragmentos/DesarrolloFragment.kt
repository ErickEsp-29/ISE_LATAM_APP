package com.ise.latam.ise_mobile.fragmentos

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Base64
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.widget.EditText
import androidx.lifecycle.ViewModelProvider
import com.ise.latam.ise_mobile.R
import com.ise.latam.ise_mobile.databinding.FragmentDesarrolloBinding
import com.ise.latam.ise_mobile.ui.home.HomeViewModel

class DesarrolloFragment : Fragment(R.layout.fragment_desarrollo) {
    lateinit var edt1: EditText
    lateinit var parrafo1: WebView
    private var _binding: FragmentDesarrolloBinding? = null
    private val binding get() = _binding!!
    @SuppressLint("SetTextI18n")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)
        _binding = FragmentDesarrolloBinding.inflate(inflater, container, false)
        val root: View = binding.root

        homeViewModel.text.observe(viewLifecycleOwner) {
            //textView.text = it
        }
        return root
    }
    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}