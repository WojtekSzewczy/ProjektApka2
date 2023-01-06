package com.example.myapplication.mainFragments

import android.os.Bundle
import androidx.navigation.NavDirections
import com.example.myapplication.R
import kotlin.Int

public class RoomsFragmentDirections private constructor() {
  private data class ActionRoomsFragmentToSelectedRoomFragment(
    public val roomID: Int
  ) : NavDirections {
    public override val actionId: Int = R.id.action_roomsFragment_to_selectedRoomFragment

    public override val arguments: Bundle
      get() {
        val result = Bundle()
        result.putInt("roomID", this.roomID)
        return result
      }
  }

  public companion object {
    public fun actionRoomsFragmentToSelectedRoomFragment(roomID: Int): NavDirections =
        ActionRoomsFragmentToSelectedRoomFragment(roomID)
  }
}
