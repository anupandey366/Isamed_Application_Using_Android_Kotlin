package com.isamed.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isamed.R
import kotlinx.android.synthetic.main.activity_lab_order.*

class LabOrderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lab_order)

        iv_back.setOnClickListener {
            finish()
        }
    }
}