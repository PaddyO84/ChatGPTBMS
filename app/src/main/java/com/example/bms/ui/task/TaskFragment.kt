package com.example.bms.ui.task

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bms.R

class TaskFragment : Fragment() {
    private lateinit var viewModel: TaskViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this)[TaskViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_task, container, false)
        val tv = view.findViewById<TextView>(R.id.tv_tasks)
        val tasks = viewModel.getTasks(requireContext())
        tv.text = "Tasks:\n" + tasks.joinToString("\n")
        return view
    }
}
