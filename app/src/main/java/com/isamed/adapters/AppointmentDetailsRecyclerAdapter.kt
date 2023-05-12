package com.isamed.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.modalClasses.AppointmentDetailsRecyclerModalDetails
import com.isamed.ui.activities.ViewAppointmentDetailsActivity
import kotlinx.android.synthetic.main.appointment_details_recycler_layout.view.*

class AppointmentDetailsRecyclerAdapter(val context: Context, val arrAppointmentDetails: ArrayList<AppointmentDetailsRecyclerModalDetails>) : RecyclerView.Adapter<AppointmentDetailsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val appointmentDate = itemView.tv_AppointmentDate
        val appointmentTime = itemView.tv_AppointmentTime

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context).inflate(R.layout.appointment_details_recycler_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arrAppointmentDetails.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.appointmentDate.text = arrAppointmentDetails[position].appointmentDate
        holder.appointmentTime.text = arrAppointmentDetails[position].appointmentTime

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,ViewAppointmentDetailsActivity::class.java))
        }

/*
        holder.appointmentTime.setOnClickListener {
            Toast.makeText(context, ""+holder.appointmentTime.text.toString(), Toast.LENGTH_SHORT).show()
        }*/
    }
}