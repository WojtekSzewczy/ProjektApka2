package com.example.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.myapplication.databinding.FragmentRegisterBinding


class RegisterFragment : Fragment() {

    private lateinit var view:FragmentRegisterBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        view = FragmentRegisterBinding.inflate(inflater, container, false)

        view.button3.setOnClickListener {
            if(view.editTextTextPassword.text.toString() != "" && view.editTextTextEmailAddress2.text.toString() != "" && view.editTextTextPassword2.text.toString() != "" && view.editTextTextPassword.text.toString() == view.editTextTextPassword2.text.toString()){
                Navigation.findNavController(view.root).navigate(R.id.action_registerFragment_to_mainFragment3)

            }
        }

        return view.root
    }

}