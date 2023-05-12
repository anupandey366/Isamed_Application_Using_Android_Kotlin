package com.isamed.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.isamed.R
import com.isamed.adapters.AppointmentDetailsRecyclerAdapter
import com.isamed.adapters.AppointmentRecyclerAdapter
import com.isamed.modalClasses.AppointmentDetailsRecyclerModalDetails
import com.isamed.modalClasses.AppointmentRecyclerModal
import com.isamed.ui.activities.HomeActivity
import kotlinx.android.synthetic.main.fragment_appointment.*
import kotlinx.android.synthetic.main.fragment_appointment.view.*
import kotlinx.android.synthetic.main.fragment_appointment.view.iv_home
import kotlinx.android.synthetic.main.fragment_test_results.view.*

class AppointmentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v: View = inflater.inflate(R.layout.fragment_appointment, container, false)

//        Recycler View Of Appointment Details

        val arrAppointmentDetails = ArrayList<AppointmentDetailsRecyclerModalDetails>()

        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("05/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("08/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("09/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrAppointmentDetails.add(AppointmentDetailsRecyclerModalDetails("11/08/2023","13:31:33"))


        v.recyclerViewAppointmentDetails.layoutManager = LinearLayoutManager(v.context,LinearLayoutManager.VERTICAL,false)

        val recyclerAppointmentAdapter = AppointmentDetailsRecyclerAdapter(v.context,arrAppointmentDetails)
        v.recyclerViewAppointmentDetails.adapter = recyclerAppointmentAdapter


        v.iv_home.setOnClickListener {
            val intent = Intent(v.context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        return v
    }
}