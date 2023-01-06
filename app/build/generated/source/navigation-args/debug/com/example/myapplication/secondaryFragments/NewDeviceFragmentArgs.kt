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

public data class NewDeviceFragmentArgs(
  public val scanResult: ScanResult
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ScanResult::class.java)) {
      result.putParcelable("scanResult", this.scanResult as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
      result.putSerializable("scanResult", this.scanResult as Serializable)
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
      result.set("scanResult", this.scanResult as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
      result.set("scanResult", this.scanResult as Serializable)
    } else {
      throw UnsupportedOperationException(ScanResult::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): NewDeviceFragmentArgs {
      bundle.setClassLoader(NewDeviceFragmentArgs::class.java.classLoader)
      val __scanResult : ScanResult?
      if (bundle.containsKey("scanResult")) {
        if (Parcelable::class.java.isAssignableFrom(ScanResult::class.java) ||
            Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
          __scanResult = bundle.get("scanResult") as ScanResult?
        } else {
          throw UnsupportedOperationException(ScanResult::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__scanResult == null) {
          throw IllegalArgumentException("Argument \"scanResult\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"scanResult\" is missing and does not have an android:defaultValue")
      }
      return NewDeviceFragmentArgs(__scanResult)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): NewDeviceFragmentArgs {
      val __scanResult : ScanResult?
      if (savedStateHandle.contains("scanResult")) {
        if (Parcelable::class.java.isAssignableFrom(ScanResult::class.java) ||
            Serializable::class.java.isAssignableFrom(ScanResult::class.java)) {
          __scanResult = savedStateHandle.get<ScanResult?>("scanResult")
        } else {
          throw UnsupportedOperationException(ScanResult::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__scanResult == null) {
          throw IllegalArgumentException("Argument \"scanResult\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"scanResult\" is missing and does not have an android:defaultValue")
      }
      return NewDeviceFragmentArgs(__scanResult)
    }
  }
}
