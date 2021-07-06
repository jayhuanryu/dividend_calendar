package com.hita.dividend_calendar.ui.stock_info

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hita.dividend_calendar.R

class StockInfoFragment : Fragment() {

    companion object {
        fun newInstance() = StockInfoFragment()
    }

    private lateinit var infoViewModel: StockInfoViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_stock_info, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        infoViewModel = ViewModelProvider(this).get(StockInfoViewModel::class.java)
        // TODO: Use the ViewModel
    }

}