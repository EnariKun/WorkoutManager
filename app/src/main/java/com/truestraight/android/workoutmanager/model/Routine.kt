package com.truestraight.android.workoutmanager.model

import java.io.Serializable
import java.util.ArrayList

class Routine(val title: String, val icon: String, val color: String, val exercise: ArrayList<Exercise>, val id: Int) : Serializable