package com.truestraight.android.workoutmanager.ui.diary

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.truestraight.android.workoutmanager.R

class DiaryFragment : Fragment() {

    private lateinit var deiaryViewModel: DiaryViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        deiaryViewModel =
            ViewModelProviders.of(this).get(DiaryViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_diary, container, false)
        val textView: TextView = root.findViewById(R.id.text_diary)
        deiaryViewModel.text.observe(this, Observer {
            textView.text = it
        })
        return root
    }
}