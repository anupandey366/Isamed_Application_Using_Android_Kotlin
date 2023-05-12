package com.isamed.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.modalClasses.LabOrderDetailsRecyclerModal
import com.isamed.ui.activities.LabOrderActivity
import com.isamed.ui.activities.LabResultActivity
import kotlinx.android.synthetic.main.lab_order_details_recycler_layout.view.*

class TestResultDetailsRecyclerAdapter(val context: Context, val arrAppointmentDetails: ArrayList<LabOrderDetailsRecyclerModal>) : RecyclerView.Adapter<TestResultDetailsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val testResultDate = itemView.tv_PaymentDate
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.lab_order_details_recycler_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arrAppointmentDetails.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.testResultDate.text = arrAppointmentDetails[position].orderDate

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,LabResultActivity::class.java))
        }

/*
        holder.appointmentTime.setOnClickListener {
            Toast.makeText(context, ""+holder.appointmentTime.text.toString(), Toast.LENGTH_SHORT).show()
        }*/
    }
}