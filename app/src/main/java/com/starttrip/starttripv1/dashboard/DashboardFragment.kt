package com.starttrip.starttripv1.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.starttrip.starttripv1.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment() {

  //region variables
  private var _binding: FragmentDashboardBinding? = null
  private val binding get() = _binding!!
  //endregion

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    //val root = inflater.inflate(R.layout.fragment_dashboard, container, false)
    _binding = FragmentDashboardBinding.inflate(inflater, container, false)

    return binding.root
  }
}
