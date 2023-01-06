package com.example.myapplication.secondaryFragments

import android.os.Bundle
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.lang.IllegalArgumentException
import kotlin.Int
import kotlin.jvm.JvmStatic

public data class SelectedRoomFragmentArgs(
  public val roomID: Int
) : NavArgs {
  public fun toBundle(): Bundle {
    val result = Bundle()
    result.putInt("roomID", this.roomID)
    return result
  }

  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    result.set("roomID", this.roomID)
    return result
  }

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): SelectedRoomFragmentArgs {
      bundle.setClassLoader(SelectedRoomFragmentArgs::class.java.classLoader)
      val __roomID : Int
      if (bundle.containsKey("roomID")) {
        __roomID = bundle.getInt("roomID")
      } else {
        throw IllegalArgumentException("Required argument \"roomID\" is missing and does not have an android:defaultValue")
      }
      return SelectedRoomFragmentArgs(__roomID)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): SelectedRoomFragmentArgs {
      val __roomID : Int?
      if (savedStateHandle.contains("roomID")) {
        __roomID = savedStateHandle["roomID"]
        if (__roomID == null) {
          throw IllegalArgumentException("Argument \"roomID\" of type integer does not support null values")
        }
      } else {
        throw IllegalArgumentException("Required argument \"roomID\" is missing and does not have an android:defaultValue")
      }
      return SelectedRoomFragmentArgs(__roomID)
    }
  }
}
