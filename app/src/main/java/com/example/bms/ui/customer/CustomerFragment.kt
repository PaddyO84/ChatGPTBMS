package com.example.bms.ui.customer

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.bms.R

class CustomerFragment : Fragment() {
    private lateinit var viewModel: CustomerViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this)[CustomerViewModel::class.java]
        val view = inflater.inflate(R.layout.fragment_customer, container, false)
        val tv = view.findViewById<TextView>(R.id.tv_customers)
        val customers = viewModel.getCustomers(requireContext())
        tv.text = "Customers:\n" + customers.joinToString("\n")
        return view
    }
}
