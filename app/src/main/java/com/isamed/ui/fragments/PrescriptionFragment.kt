package com.isamed.ui.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.isamed.R
import com.isamed.ui.activities.HomeActivity
import com.isamed.ui.activities.PrescriptionActivity
import kotlinx.android.synthetic.main.fragment_prescription.view.*
import kotlinx.android.synthetic.main.fragment_test_results.view.*
import kotlinx.android.synthetic.main.fragment_test_results.view.iv_home

class PrescriptionFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_prescription, container, false)

        v.iv_add.setOnClickListener {
            val intent = Intent(v.context, PrescriptionActivity::class.java)
            startActivity(intent)
        }

        v.iv_homePrescription.setOnClickListener {
            val intent = Intent(v.context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        return v
    }
}