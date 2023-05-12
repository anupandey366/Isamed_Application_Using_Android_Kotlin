package com.isamed.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.modalClasses.DiagnosisListRecyclerModal
import kotlinx.android.synthetic.main.cpt_code_list_recycler_layout.view.*
import kotlinx.android.synthetic.main.diagnosis_list_recycler_layout.view.*

class DiagnosisListRecyclerAdapter(val context: Context, val arrDiagnosisList: ArrayList<DiagnosisListRecyclerModal>) : RecyclerView.Adapter<DiagnosisListRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val diagnosisName = itemView.cb_diagnosisList
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.diagnosis_list_recycler_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arrDiagnosisList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.diagnosisName.text = arrDiagnosisList[position].diagnosisName

        /*holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,LabOrderActivity::class.java))
        }*/

/*
        holder.appointmentTime.setOnClickListener {
            Toast.makeText(context, ""+holder.appointmentTime.text.toString(), Toast.LENGTH_SHORT).show()
        }*/
    }
}