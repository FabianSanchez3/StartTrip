package com.starttrip.starttripv1.notifications

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import com.starttrip.starttripv1.R
import com.starttrip.starttripv1.databinding.FragmentNotificationsBinding

class NotificationsFragment : Fragment() {

  //region variables
  private var _binding: FragmentNotificationsBinding? = null
  private val binding get() = _binding!!

  //endregion

  override fun onCreateView( inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    _binding = FragmentNotificationsBinding.inflate(inflater, container, false)
    return binding.root
  }

}
