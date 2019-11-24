package com.uan.efip.ui.capital_assets

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.uan.efip.R

class CapitalAssetsFragment : Fragment() {

    private lateinit var capitalAssetsViewModel: CapitalAssetsViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        capitalAssetsViewModel =
            ViewModelProviders.of(this).get(CapitalAssetsViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_capital_assets, container, false)

        return root
    }
}