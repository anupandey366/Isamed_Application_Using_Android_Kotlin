package com.isamed.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.isamed.R
import com.isamed.adapters.CPTCodeListRecyclerAdapter
import com.isamed.adapters.DiagnosisListRecyclerAdapter
import com.isamed.modalClasses.CPTCodeListRecyclerModal
import com.isamed.modalClasses.DiagnosisListRecyclerModal
import kotlinx.android.synthetic.main.activity_cptcode_list.*
import kotlinx.android.synthetic.main.activity_diagnosis_list.*

class DiagnosisListActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_diagnosis_list)

        tv_nextDiagnosis.setOnClickListener {
            val intent = Intent(this@DiagnosisListActivity,CptDetailsActivity::class.java)
            startActivity(intent)
        }

        iv_backDiagnosis.setOnClickListener {
            finish()
        }

        val arrDiagnosisList = ArrayList<DiagnosisListRecyclerModal>()

        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))
        arrDiagnosisList.add(DiagnosisListRecyclerModal("A60.9 ANOGENITAL HERPESVIRAL INFECTION"))


        recyclerViewDiagnosisList.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val recyclerCPTCodeListAdapter = DiagnosisListRecyclerAdapter(this,arrDiagnosisList)
        recyclerViewDiagnosisList.adapter = recyclerCPTCodeListAdapter


    }
}