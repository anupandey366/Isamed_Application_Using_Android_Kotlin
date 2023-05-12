package com.isamed.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.databinding.LayoutCptDetailsFormBinding
import com.isamed.modalClasses.CptDetailsFormModel

class CptDetailsFormAdapter(val context: Context, val arrPatientDetails: ArrayList<CptDetailsFormModel>) : RecyclerView.Adapter<CptDetailsFormAdapter.ViewHolder>(){
    lateinit var binding: LayoutCptDetailsFormBinding
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {


        val tvCptCodeValue = itemView.findViewById<TextView>(R.id.tv_cptCodeValue)
        val tvDescriptionValue = itemView.findViewById<TextView>(R.id.tv_descriptionValue)
        val tvFeesValue = itemView.findViewById<TextView>(R.id.tv_feesValue)
        val tvIcd1Value = itemView.findViewById<TextView>(R.id.tv_icd1Value)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {


        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.layout_cpt_details_form, parent, false))
    }

    override fun getItemCount(): Int {
        return arrPatientDetails.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        arrPatientDetails[position].apply {
            holder.tvCptCodeValue.text= cptCode
            holder.tvDescriptionValue.text= description
            holder.tvFeesValue.text= fees
            holder.tvIcd1Value.text= icd1
        }
    }


}