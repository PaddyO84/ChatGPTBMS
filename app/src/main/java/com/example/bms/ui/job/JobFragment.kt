package com.example.bms.ui.job

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bms.R

class JobFragment : Fragment() {
    private lateinit var viewModel: JobViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this)[JobViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_job, container, false)
        val tv = view.findViewById<TextView>(R.id.tv_jobs)
        val jobs = viewModel.getJobs(requireContext())
        tv.text = "Jobs:\n" + jobs.joinToString("\n")
        return view
    }
}
