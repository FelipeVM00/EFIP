package com.uan.efip.ui.entrys

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import com.uan.efip.R

class EntrysFragment : Fragment() {

    private lateinit var entrysViewModel: EntrysViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        entrysViewModel =
            ViewModelProviders.of(this).get(EntrysViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_entrys, container, false)
        return root
    }
}