package com.starttrip.starttripv1.fragmentb

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.starttrip.starttripv1.databinding.FragmentBBinding


class FragmentB : Fragment() {

    //region variables
    private var _binding: FragmentBBinding? = null
    private val binding get() = _binding!!
    private var textoData:String? = null
    //endregion

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            textoData = it.getString("nombre")
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding =  FragmentBBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.txtDataFragA.text = textoData
        binding.btnNavFragA.setOnClickListener {
            findNavController().previousBackStackEntry?.savedStateHandle?.set("key", "HOLA DESDE FRAGMENT B")
            findNavController().popBackStack()
        }
    }



}
