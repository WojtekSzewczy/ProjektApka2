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

public class MyDevicesFragmentDirections private constructor() {
  private data class ActionMyDevicesFragmentToSelectedDeviceFragment(
    public val result: ScanResult
  ) : NavDirections {
    public override val actionId: Int = R.id.action_myDevicesFragment_to_selectedDeviceFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionMyDevicesFragmentToSelectedDeviceFragment(result: ScanResult): NavDirections =
        ActionMyDevicesFragmentToSelectedDeviceFragment(result)
  }
}
