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
import com.isamed.adapters.PaymentDetailsRecyclerAdapter
import com.isamed.modalClasses.AppointmentDetailsRecyclerModalDetails
import com.isamed.ui.activities.HomeActivity
import kotlinx.android.synthetic.main.fragment_payment.view.*
import kotlinx.android.synthetic.main.fragment_payment.view.iv_home
import kotlinx.android.synthetic.main.fragment_test_results.view.*

class PaymentFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_payment, container, false)

        //        Recycler View Of Payment Details

        val arrPaymentDetails = ArrayList<AppointmentDetailsRecyclerModalDetails>()

        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))
        arrPaymentDetails.add(AppointmentDetailsRecyclerModalDetails("03/08/2023","13:31:33"))


        v.recyclerViewPaymentDetails.layoutManager = LinearLayoutManager(v.context,
            LinearLayoutManager.VERTICAL,false)

        val recyclerPaymentAdapter = PaymentDetailsRecyclerAdapter(v.context,arrPaymentDetails)
        v.recyclerViewPaymentDetails.adapter = recyclerPaymentAdapter

        v.iv_home.setOnClickListener {
            val intent = Intent(v.context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        return v
    }
}