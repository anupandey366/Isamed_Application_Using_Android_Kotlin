package com.isamed.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import com.isamed.R
import com.isamed.databinding.ActivityFilterBinding
import kotlinx.android.synthetic.main.activity_filter.*

class FilterActivity : AppCompatActivity() {

    lateinit var binding : ActivityFilterBinding
    var flagGo=0
    lateinit var pageInfo : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFilterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pageInfo=intent.getStringExtra("page").toString()

        iv_back.setOnClickListener {
            finish()
        }

        tv_search.setOnClickListener {
            ValidateSearch()
        }

    }
/*
    private fun ValidateFirstName() {

        if (et_firstName.text.toString().isEmpty())
        {
            Toast.makeText(this, "Please enter first name", Toast.LENGTH_SHORT).show()
        }
        else
        {
            flagGo++
        }
    }

    private fun ValidateLastName() {

        if (et_lastName.text.toString().isEmpty())
        {
            Toast.makeText(this, "Please enter last name", Toast.LENGTH_SHORT).show()
        }

        else
        {
            flagGo++
        }
    }*/

    private fun ValidateSearch() {

        if (!binding.etFirstName.text.toString().isEmpty() && !binding.etLastName.text.toString().isEmpty())
        {
                    val intent = Intent(this@FilterActivity, PatientListActivity::class.java)
            if (pageInfo=="sonogramToFilter")
            {
                intent.putExtra("page","sonogramToFilter")
            }
            else
            {
                intent.putExtra("page","othersToFilter")
            }

            startActivity(intent)
                }
        else
        {
            ValidateFilterPopUp(binding.tvSearch,"*Please fill mandatory fields.")
        }

    }

    fun ValidateFilterPopUp(view: View?, msg : String) {


        // step 1
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.terms_popup_layout, null)

        var txtView: TextView = popupView.findViewById(R.id.tv_popupMsg)
        var okBtnTxt: TextView = popupView.findViewById(R.id.tv_okButton)

        txtView.text=msg
        // step 2
        val wid = LinearLayout.LayoutParams.WRAP_CONTENT
        val high = LinearLayout.LayoutParams.WRAP_CONTENT
        val focus= true
        val popupWindow = PopupWindow(popupView, wid, high, focus)

        // step 3
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0)
        okBtnTxt.setOnClickListener {
            popupWindow.dismiss()
        }

    }
}