package com.isamed.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.modalClasses.LabResultRecyclerModal
import kotlinx.android.synthetic.main.lab_result_recycler_layout.view.*

class LabResultRecyclerAdapter(val context: Context, val arrAppointment: ArrayList<LabResultRecyclerModal>) : RecyclerView.Adapter<LabResultRecyclerAdapter.ViewHolder>(){
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val testName = itemView.tv_testName
        val testDate = itemView.tv_testDate
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.lab_result_recycler_layout, parent, false))
    }

    override fun getItemCount(): Int {
        return arrAppointment.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.testName.text = arrAppointment[position].TestName
        holder.testDate.text = arrAppointment[position].TestDate
    }

}