package com.justwork.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.justwork.app.viewmodels.CustomersViewModel
import com.justwork.app.R

class CustomersFragment : Fragment() {

    private val vm: CustomersViewModel by viewModels()

    companion object {
        fun newInstance() = CustomersFragment()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_customers, container, false)
    }
}
