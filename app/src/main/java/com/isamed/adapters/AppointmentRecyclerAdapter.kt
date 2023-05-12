package com.isamed.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.modalClasses.AppointmentRecyclerModal
import kotlinx.android.synthetic.main.appointment_recycler_layout.view.*

class AppointmentRecyclerAdapter(val context: Context, val arrAppointment: ArrayList<AppointmentRecyclerModal>) : RecyclerView.Adapter<AppointmentRecyclerAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.tv_name
        val startTime = itemView.tv_startTime
        val endTime = itemView.tv_endTime
        val contact = itemView.tv_phone
        val reason = itemView.tv_reason
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.appointment_recycler_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return arrAppointment.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = arrAppointment[position].name
        holder.startTime.text = arrAppointment[position].startTime
        holder.endTime.text = arrAppointment[position].endTime
        holder.contact.text = arrAppointment[position].contact
        holder.reason.text = arrAppointment[position].reason

    }

}