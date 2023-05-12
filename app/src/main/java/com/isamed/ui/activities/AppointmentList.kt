package com.isamed.ui.activities

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.isamed.R
import com.isamed.adapters.AppointmentRecyclerAdapter
import com.isamed.databinding.ActivityAppointmentListBinding
import com.isamed.modalClasses.AppointmentRecyclerModal

class AppointmentList : AppCompatActivity() {

    lateinit var binding: ActivityAppointmentListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAppointmentListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        ////////////////////////////////////////////////////

        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.tvAppointment.setOnClickListener {
            val intent = Intent(this@AppointmentList,BookAppointment::class.java)
            startActivity(intent)
        }

        binding.ivAppointmentFilter.setOnClickListener {
            val intent = Intent(this@AppointmentList,AppointmentListFilterActivity::class.java)
            startActivity(intent)
        }


        /////////////////////////////////////////////////////////////////////////////

        val arrAppointment = ArrayList<AppointmentRecyclerModal>()

        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))

        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))

        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))

        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))

        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))

        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))
        arrAppointment.add(AppointmentRecyclerModal("WINTIRCH ELIZABETH","09:00 AM","09:30 AM","123456789","CHECKUP"))



        binding.recyclerViewAppointment.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val recyclerAppointmentAdapter = AppointmentRecyclerAdapter(this,arrAppointment)
        binding.recyclerViewAppointment.adapter = recyclerAppointmentAdapter

        ////////////////////////////////////////////////////////////////////////////
    }
}