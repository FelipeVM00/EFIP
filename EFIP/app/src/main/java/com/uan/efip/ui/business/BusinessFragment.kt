package com.uan.efip.ui.business

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import com.uan.efip.R

class BusinessFragment : Fragment() {

    private lateinit var businessViewModel: BusinessViewModel

    val types = arrayOf("Bogotá", "Medellin", "Cali", "Sta Marta", "Tunja", "Villavicencio", "Otra...")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val t=inflater.inflate(R.layout.fragment_business, container, false)
        val spinner = t.findViewById<Spinner>(R.id.spinner2)
        spinner?.adapter =
            ArrayAdapter(this.activity!!, R.layout.support_simple_spinner_dropdown_item, types)
        spinner?.onItemSelectedListener = object :AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(parent: AdapterView<*>?) {
                println("Error")
            }

            override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                val type = parent?.getItemAtPosition(position).toString()
                //  Toast.makeText(activity,type, Toast.LENGTH_LONG).show()
                println(type)
            }

        }
        return t
    }
}