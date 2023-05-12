package com.isamed.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.isamed.R
import com.isamed.adapters.CPTCodeListRecyclerAdapter
import com.isamed.modalClasses.CPTCodeListRecyclerModal
import com.isamed.modalClasses.LabOrderDetailsRecyclerModal
import kotlinx.android.synthetic.main.activity_cptcode_list.*

class CPTCodeListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cptcode_list)

        val arrCPTCOdeList = ArrayList<CPTCodeListRecyclerModal>()

        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))
        arrCPTCOdeList.add(CPTCodeListRecyclerModal("364115 COLLECTION VENOUS BLOOD VENIPUNCTURE"))


        recyclerViewCPTCodeList.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val recyclerCPTCodeListAdapter = CPTCodeListRecyclerAdapter(this,arrCPTCOdeList)
        recyclerViewCPTCodeList.adapter = recyclerCPTCodeListAdapter

        tv_next.setOnClickListener {
            val intent = Intent(this@CPTCodeListActivity, DiagnosisListActivity::class.java)
            startActivity(intent)
        }

        iv_back.setOnClickListener {
            finish()
        }
    }
}