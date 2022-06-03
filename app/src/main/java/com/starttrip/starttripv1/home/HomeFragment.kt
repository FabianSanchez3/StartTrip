package com.starttrip.starttripv1.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.starttrip.starttripv1.R
import com.starttrip.starttripv1.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

  //region variables
  private var _binding: FragmentHomeBinding? = null
  private val binding get() = _binding!!
  //endregion

  override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    _binding  = FragmentHomeBinding.inflate(inflater, container, false)
    return binding.root
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    binding.btnNavFragB.setOnClickListener {
      val bundle = Bundle()
      bundle.putString("nombre","Mensaje de Prueba")
      findNavController().navigate(R.id.navigation_frag_b,bundle)
    }

    findNavController().currentBackStackEntry?.savedStateHandle?.getLiveData<String>("key")?.observe(viewLifecycleOwner) { texto ->
      binding.txtInfoFragB.text = texto
    }
  }

}
