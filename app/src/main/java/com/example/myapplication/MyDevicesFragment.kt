package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.myapplication.databinding.FragmentMyDevicesBinding


class MyDevicesFragment : Fragment() {
   private lateinit var view :FragmentMyDevicesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.onBackPressedDispatcher?.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
            }
        })
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        MainActivity.instance.bottomNavigationView.visibility = View.VISIBLE

        // Inflate the layout for this fragment
        view =  FragmentMyDevicesBinding.inflate(inflater, container, false)

        view.button5.setOnClickListener {
            Navigation.findNavController(view.root).navigate(R.id.action_myDevicesFragment_to_selectedDeviceFragment)
        }

        return view.root
    }

}