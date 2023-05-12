package com.isamed.ui.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.isVisible
import com.isamed.R
import com.isamed.databinding.ActivityPatientListBinding
import kotlinx.android.synthetic.main.activity_patient_list.*

class PatientListActivity : AppCompatActivity() {

    lateinit var binding : ActivityPatientListBinding
    lateinit var pageInfo : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatientListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        pageInfo=intent.getStringExtra("page").toString()

        ll_patientDatail.setOnClickListener {
            if (pageInfo=="sonogramToFilter")
            {
                val intent = Intent(this@PatientListActivity, SonogramActivity::class.java)//DiagnosisListActivity
                startActivity(intent)
            }
            else {
                val intent = Intent(this@PatientListActivity, PatientAllDetailsActivity::class.java)
                startActivity(intent)
            }
        }

        iv_back.setOnClickListener {
            finish()
        }

        /*iv_search.setOnClickListener {
            Toast.makeText(this, "Searching....", Toast.LENGTH_SHORT).show()
        }*/

        binding.ivSearch.setOnClickListener {
            binding.llGoneSearchBar.isVisible=true
        }
        binding.ivGoneCrossIcon.setOnClickListener {
            binding.llGoneSearchBar.isVisible=false
        }
        binding.ivGoneSearchIcon.setOnClickListener {
            Toast.makeText(this, "Searching...", Toast.LENGTH_SHORT).show()
        }
    }
}