package com.truestraight.android.workoutmanager.model

import java.io.Serializable
import java.util.ArrayList

class Group(val title: String, val icon: String, val color: String, val exercise: ArrayList<Exercise>) : Serializable