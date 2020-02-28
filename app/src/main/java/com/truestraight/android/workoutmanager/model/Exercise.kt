package com.truestraight.android.workoutmanager.model

import java.io.Serializable
import java.util.*

class Exercise(val title: String, val icon: String, val color: String, val group: String, val sets: Int, val reps: Int, val weight: Int, val interval: Int, val date: Date, val id: Int) : Serializable