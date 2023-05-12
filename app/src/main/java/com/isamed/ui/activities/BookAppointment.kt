package com.isamed.ui.activities

import android.app.DatePickerDialog
import android.app.TimePickerDialog
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
import com.isamed.databinding.ActivityBookAppointmentBinding
import kotlinx.android.synthetic.main.activity_book_appointment.*
import java.text.SimpleDateFormat
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class BookAppointment : AppCompatActivity() {

    lateinit var binding : ActivityBookAppointmentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookAppointmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val cal = Calendar.getInstance()
        val y = cal.get(Calendar.YEAR)
        val m = cal.get(Calendar.MONTH)
        val d = cal.get(Calendar.DAY_OF_MONTH)


        binding.etStartDate.setOnClickListener {
            val datepickerdialog: DatePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                // Display Selected date in textbox
                binding.etStartDate.setText("" + dayOfMonth + "/" +"${monthOfYear+1}" + "/" + year)
            }, y, m, d)

            datepickerdialog.show()
        }

        binding.etEndDate.setOnClickListener {
            val datepickerdialog: DatePickerDialog = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->

                // Display Selected date in textbox
                binding.etEndDate.setText("" + dayOfMonth + "/" +"${monthOfYear+1}" + "/" + year)
            }, y, m, d)

            datepickerdialog.show()
        }

        binding.etStartTime.setOnClickListener {

                val cal = Calendar.getInstance()
                val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                    cal.set(Calendar.HOUR_OF_DAY, hour)
                    cal.set(Calendar.MINUTE, minute)
                    binding.etStartTime.text = SimpleDateFormat("HH:mm").format(cal.time)
                }
                TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()

        }

        binding.etEndTime.setOnClickListener {

            val cal = Calendar.getInstance()
            val timeSetListener = TimePickerDialog.OnTimeSetListener { timePicker, hour, minute ->
                cal.set(Calendar.HOUR_OF_DAY, hour)
                cal.set(Calendar.MINUTE, minute)
                binding.etEndTime.text = SimpleDateFormat("HH:mm").format(cal.time)
            }
            TimePickerDialog(this, timeSetListener, cal.get(Calendar.HOUR_OF_DAY), cal.get(Calendar.MINUTE), true).show()

        }

        iv_back.setOnClickListener {
            finish()
        }

        tv_done.setOnClickListener {
            ValidateDone()

        }

    }

    fun ValidateBookAppointmentPopUp(view: View?, msg : String) {

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
            !binding.etLastName.text.toString().isEmpty() &&
            !binding.etStartTime.text.toString().isEmpty() &&
            !binding.etEndDate.text.toString().isEmpty() &&
            !binding.etStartTime.text.toString().isEmpty() &&
            !binding.etEndTime.text.toString().isEmpty()
        )
        {
            Toast.makeText(this, "Done..", Toast.LENGTH_SHORT).show()
            finish()
        }

        else
        {
            ValidateBookAppointmentPopUp(binding.tvDone,"*Please fill all fields.")
        }

    }
}