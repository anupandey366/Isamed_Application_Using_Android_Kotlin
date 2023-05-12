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
import com.isamed.adapters.LabOrderDetailsRecyclerAdapter
import com.isamed.modalClasses.LabOrderDetailsRecyclerModal
import com.isamed.ui.activities.HomeActivity
import kotlinx.android.synthetic.main.fragment_appointment.*
import kotlinx.android.synthetic.main.fragment_lab_order.view.*

class LabOrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_lab_order, container, false)

        val arrLabOrderDetails = ArrayList<LabOrderDetailsRecyclerModal>()

        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))
        arrLabOrderDetails.add(LabOrderDetailsRecyclerModal("03/08/2023"))



        v.recyclerViewLabOrderDetails.layoutManager = LinearLayoutManager(v.context,
            LinearLayoutManager.VERTICAL,false)

        val recyclerLabOrderAdapter = LabOrderDetailsRecyclerAdapter(v.context,arrLabOrderDetails)
        v.recyclerViewLabOrderDetails.adapter = recyclerLabOrderAdapter

        v.iv_home.setOnClickListener {
            val intent = Intent(v.context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        return v
    }
}