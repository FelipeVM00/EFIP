package com.uan.efip.ui.debts

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.uan.efip.R

class DebtsFragment : Fragment() {

    private lateinit var debtsViewModel: DebtsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        debtsViewModel =
            ViewModelProviders.of(this).get(DebtsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_debts, container, false)
        return root
    }
}