package com.example.myapplication.secondaryFragments

import android.bluetooth.le.ScanResult
import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class SelectedDeviceFragmentArgs(
  public val result: ScanResult
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ScanResult::class.java)) {
      result.putParcelable("result", this.result as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
      result.putSerializable("result", this.result as Serializable)
    } else {
      throw UnsupportedOperationException(ScanResult::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ScanResult::class.java)) {
      result.set("result", this.result as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
      result.set("result", this.result as Serializable)
    } else {
      throw UnsupportedOperationException(ScanResult::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): SelectedDeviceFragmentArgs {
      bundle.setClassLoader(SelectedDeviceFragmentArgs::class.java.classLoader)
      val __result : ScanResult?
      if (bundle.containsKey("result")) {
        if (Parcelable::class.java.isAssignableFrom(ScanResult::class.java) ||
            Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
          __result = bundle.get("result") as ScanResult?
        } else {
          throw UnsupportedOperationException(ScanResult::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__result == null) {
          throw IllegalArgumentException("Argument \"result\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"result\" is missing and does not have an android:defaultValue")
      }
      return SelectedDeviceFragmentArgs(__result)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle):
        SelectedDeviceFragmentArgs {
      val __result : ScanResult?
      if (savedStateHandle.contains("result")) {
        if (Parcelable::class.java.isAssignableFrom(ScanResult::class.java) ||
            Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
          __result = savedStateHandle.get<ScanResult?>("result")
        } else {
          throw UnsupportedOperationException(ScanResult::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__result == null) {
          throw IllegalArgumentException("Argument \"result\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"result\" is missing and does not have an android:defaultValue")
      }
      return SelectedDeviceFragmentArgs(__result)
    }
  }
}
