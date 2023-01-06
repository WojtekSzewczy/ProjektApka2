package com.example.myapplication.mainFragments

import android.bluetooth.le.ScanResult
import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.myapplication.R
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class DevicesFragmentDirections private constructor() {
  private data class ActionDevicesFragmentToNewDeviceFragment(
    public val scanResult: ScanResult
  ) : NavDirections {
    public override val actionId: Int = R.id.action_devicesFragment_to_newDeviceFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionDevicesFragmentToNewDeviceFragment(scanResult: ScanResult): NavDirections =
        ActionDevicesFragmentToNewDeviceFragment(scanResult)
  }
}
