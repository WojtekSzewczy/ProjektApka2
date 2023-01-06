package com.example.myapplication.LoginRegisterFragments

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.myapplication.R

public class LoginFragmentDirections private constructor() {
  public companion object {
    public fun actionMainFragment3ToDevicesFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment3_to_devicesFragment)

    public fun actionMainFragment3ToRegisterFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_mainFragment3_to_registerFragment)
  }
}
