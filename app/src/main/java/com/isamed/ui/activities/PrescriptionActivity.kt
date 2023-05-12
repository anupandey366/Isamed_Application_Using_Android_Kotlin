package com.isamed.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isamed.R
import kotlinx.android.synthetic.main.activity_prescription.*

class PrescriptionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prescription)

        iv_back.setOnClickListener {
            finish()
        }

        tv_submitButton.setOnClickListener {
            finish()
        }

    }
}