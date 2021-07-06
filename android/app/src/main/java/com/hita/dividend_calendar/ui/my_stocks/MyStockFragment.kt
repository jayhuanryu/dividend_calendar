package com.hita.dividend_calendar.ui.my_stocks

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.hita.dividend_calendar.R

class MyStockFragment : Fragment() {

    private lateinit var myStockViewModel: MyStockViewModel

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        myStockViewModel =
                ViewModelProvider(this).get(MyStockViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_my_stocks, container, false)
        val textView: TextView = root.findViewById(R.id.text_dashboard)
        myStockViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })
        return root
    }
}