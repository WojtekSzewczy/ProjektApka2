package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentMainBinding


class MainFragment : Fragment() {

    private lateinit var view: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        view = FragmentMainBinding.inflate(inflater, container, false)

        view.button.setOnClickListener {
            if (view.editTextNumberPassword.text.toString() != "" && view.editTextTextEmailAddress.text.toString() != ""){
                Navigation.findNavController(view.root).navigate(R.id.action_mainFragment3_to_devicesFragment)
                MainActivity.instance.bottomNavigationView.visibility = View.VISIBLE
            }
            else{
                Toast.makeText(requireContext(),"Cos jest nie tak", Toast.LENGTH_SHORT).show()
            }
        }

        view.rejestrujTextView.setOnClickListener {
            Navigation.findNavController(view.root)
                .navigate(R.id.action_mainFragment3_to_registerFragment)

        }

        return view.root
    }

}