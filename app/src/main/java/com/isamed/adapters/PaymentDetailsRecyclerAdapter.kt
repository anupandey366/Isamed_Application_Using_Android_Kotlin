package com.isamed.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.modalClasses.AppointmentDetailsRecyclerModalDetails
import com.isamed.ui.activities.PaymentScreenActivity
import com.isamed.ui.activities.ViewAppointmentDetailsActivity
import kotlinx.android.synthetic.main.payment_details_recycler_layout.view.*

class PaymentDetailsRecyclerAdapter(val context: Context, val arrPaymentDetails: ArrayList<AppointmentDetailsRecyclerModalDetails>) : RecyclerView.Adapter<PaymentDetailsRecyclerAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val paymentDate = itemView.tv_PaymentDate
        val paymentTime = itemView.tv_PaymentTime

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(context)
                .inflate(R.layout.payment_details_recycler_layout, parent, false)
        )
    }

    override fun getItemCount(): Int {
        return arrPaymentDetails.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.paymentDate.text = arrPaymentDetails[position].appointmentDate
        holder.paymentTime.text = arrPaymentDetails[position].appointmentTime

        holder.itemView.setOnClickListener {
            context.startActivity(Intent(context,PaymentScreenActivity::class.java))
        }

/*
        holder.appointmentTime.setOnClickListener {
            Toast.makeText(context, ""+holder.appointmentTime.text.toString(), Toast.LENGTH_SHORT).show()
        }*/
    }
}