package com.isamed.ui.activities

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.*
import com.isamed.R
import com.isamed.databinding.ActivityAppointmentListFilterBinding
import kotlinx.android.synthetic.main.activity_appointment_list_filter.*
import java.text.SimpleDateFormat
import java.util.*

class AppointmentListFilterActivity : AppCompatActivity() {

    lateinit var binding : ActivityAppointmentListFilterBinding
    var cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppointmentListFilterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iv_back.setOnClickListener {
            finish()
        }

        tv_done.setOnClickListener {
            ValidateDone()
        }

        val dateSetListener = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateStartDate()
            }
        }

        binding.tvFromDate!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                DatePickerDialog(this@AppointmentListFilterActivity,
                    dateSetListener,
                    // set DatePickerDialog to point to today's date when it loads up
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }

        })

//        date to

        val dateSetListenerTo = object : DatePickerDialog.OnDateSetListener {
            override fun onDateSet(view: DatePicker, year: Int, monthOfYear: Int,
                                   dayOfMonth: Int) {
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, monthOfYear)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateToDate()
            }
        }

        binding.tvToDate!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(view: View) {
                DatePickerDialog(this@AppointmentListFilterActivity,
                    dateSetListenerTo,
                    // set DatePickerDialog to point to today's date when it loads up
                    cal.get(Calendar.YEAR),
                    cal.get(Calendar.MONTH),
                    cal.get(Calendar.DAY_OF_MONTH)).show()
            }

        })
    }
    private fun updateDateStartDate() {
        val myFormat = "MM/dd/yyyy" // mention the format you need
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        binding.tvFromDate!!.text = sdf.format(cal.time)
    }

    private fun updateDateToDate() {
        val myFormat = "MM/dd/yyyy" // mention the format you need
        val sdf = SimpleDateFormat(myFormat, Locale.US)
        binding.tvToDate!!.text = sdf.format(cal.time)
    }


    fun ValidateAppointmentFilterPopUp(view: View?, msg : String) {

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

    private fun ValidateDone() {


        if (!binding.etFirstName.text.toString().isEmpty() &&
            !binding.etLasstName.text.toString().isEmpty() &&
            !binding.etAccountNumber.text.toString().isEmpty() &&
            !binding.etSsn.text.toString().isEmpty() &&
            !binding.etProvider.text.toString().isEmpty() &&
            !binding.etLocation.text.toString().isEmpty() &&
            !binding.etPractice.text.toString().isEmpty()
        )
        {
            val intent = Intent(this@AppointmentListFilterActivity,CPTCodeListActivity::class.java)
            startActivity(intent)
            Toast.makeText(this, "Done..", Toast.LENGTH_SHORT).show()
            finish()
        }

        else
        {
            ValidateAppointmentFilterPopUp(binding.tvDone,"*Please fill mandatory fields.")
        }

    }
}