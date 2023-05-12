package com.isamed.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.isamed.R
import com.isamed.adapters.TestResultDetailsRecyclerAdapter
import com.isamed.modalClasses.LabOrderDetailsRecyclerModal
import com.isamed.ui.activities.HomeActivity
import kotlinx.android.synthetic.main.fragment_lab_order.view.*
import kotlinx.android.synthetic.main.fragment_test_results.view.*
import kotlinx.android.synthetic.main.fragment_test_results.view.iv_home

class TestResultsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val v = inflater.inflate(R.layout.fragment_test_results, container, false)

        val arrTestResultDetails = ArrayList<LabOrderDetailsRecyclerModal>()

        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))
        arrTestResultDetails.add(LabOrderDetailsRecyclerModal("04/28/2023"))

        v.recyclerViewTestResultDetails.layoutManager = LinearLayoutManager(v.context,
            LinearLayoutManager.VERTICAL,false)

        val recyclerTestResultAdapter = TestResultDetailsRecyclerAdapter(v.context,arrTestResultDetails)
        v.recyclerViewTestResultDetails.adapter = recyclerTestResultAdapter

        v.iv_home.setOnClickListener {
            val intent = Intent(v.context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        return v
    }
}