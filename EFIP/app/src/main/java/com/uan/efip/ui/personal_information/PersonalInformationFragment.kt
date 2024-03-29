package com.uan.efip.ui.personal_information

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.uan.efip.R

class PersonalInformationFragment : Fragment() {

    val types = arrayOf("Dr", "Dra", "Sr", "Sra", "Mr", "Srta", "Lcdo", "Lcda")

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val t=inflater.inflate(R.layout.fragment_personal_information, container, false)
        val spinner = t.findViewById<Spinner>(R.id.spinner)
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