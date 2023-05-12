package com.isamed.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.modalClasses.CPTCodeListRecyclerModal
import com.isamed.modalClasses.LabOrderDetailsRecyclerModal
import kotlinx.android.synthetic.main.cpt_code_list_recycler_layout.view.*

class CPTCodeListRecyclerAdapter(val context: Context, val arrCPTCodeList: ArrayList<CPTCodeListRecyclerModal>) : RecyclerView.Adapter<CPTCodeListRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val cptCode = itemView.cb_CPTCode
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.cpt_code_list_recycler_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arrCPTCodeList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.cptCode.text = arrCPTCodeList[position].cptCode

        /*holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,LabOrderActivity::class.java))
        }*/

/*
        holder.appointmentTime.setOnClickListener {
            Toast.makeText(context, ""+holder.appointmentTime.text.toString(), Toast.LENGTH_SHORT).show()
        }*/
    }
}