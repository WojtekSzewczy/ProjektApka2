package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNavigationView:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        instance=this
        bottomNavigationView = findViewById(R.id.bottomNavigation)

        bottomNavigationView.visibility=View.GONE
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fragmentContainerView5) as NavHostFragment

        val navController = navHostFragment.navController

        bottomNavigationView.setupWithNavController(navController)

      /*  bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.selectedDeviceFragment ->{
                    findNavController(R.id.fragmentContainerView5).navigateUp()

                }
                R.id.newDeviceFragment ->{
                    findNavController(R.id.fragmentContainerView5).navigateUp()

                }
                R.id.selectedRoomFragment->{
                    findNavController(R.id.fragmentContainerView5).navigateUp()

                }
                else -> {}
            }


            return@setOnItemSelectedListener true
        }*/
    }

    companion object {
        lateinit var instance: MainActivity
    }
}