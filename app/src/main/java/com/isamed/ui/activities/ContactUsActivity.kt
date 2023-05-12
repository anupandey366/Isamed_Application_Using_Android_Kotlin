package com.isamed.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import android.widget.Toast
import com.isamed.R
import com.isamed.databinding.ActivityContactUsBinding

class ContactUsActivity : AppCompatActivity() {

    lateinit var binding: ActivityContactUsBinding
    var flagGo=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityContactUsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvSubmitButton.setOnClickListener {
           ValidateContactUs()
        }

        binding.ivBackContactUs.setOnClickListener {
            finish()
        }
    }

    private fun ValidateContactUs() {


        if (binding.etName.text.isNotEmpty() && binding.etSubject.text.isNotEmpty() && binding.etDescription.text.isNotEmpty())
        {
            flagGo++
            Toast.makeText(this, "Submitted", Toast.LENGTH_SHORT).show()
            finish()
        }
        else
        {
            ValidateContactUsPopUp(binding.etDescription,"Please fil all the fields.")
        }
    }

    fun ValidateContactUsPopUp(view: View?, msg : String) {


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