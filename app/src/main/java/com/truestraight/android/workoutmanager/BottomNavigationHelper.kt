package com.truestraight.android.workoutmanager

import android.annotation.SuppressLint
import android.util.Log
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationMenuView
import com.google.android.material.bottomnavigation.BottomNavigationView

class BottomNavigationHelper {
    @SuppressLint("RestrictedApi")
    fun disableMode(view : BottomNavigationView) {
        var menuView : BottomNavigationMenuView = view.getChildAt(0) as BottomNavigationMenuView

        //アニメーションをなくす
        try {
            menuView.javaClass.getDeclaredField("mShiftingMode").apply {
                isAccessible = true
                setBoolean(menuView, false)
                isAccessible = false
            }
            for (i in 0..menuView.childCount - 1) {
                val item = menuView.getChildAt(i) as BottomNavigationItemView
                item.setShifting(false)
                item.setChecked(item.itemData.isChecked)
            }
        } catch (e: NoSuchFieldException) {
            Log.e("BNVHelper", "Unable to get shift mode field", e)
        } catch (e: IllegalAccessException) {
            Log.e("BNVHelper", "Unable to change value of shift mode", e)
        }
    }
}