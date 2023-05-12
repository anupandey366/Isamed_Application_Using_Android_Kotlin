package com.isamed.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isamed.R
import kotlinx.android.synthetic.main.activity_payment_screen.*

class PaymentScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_screen)

        iv_backPayment.setOnClickListener {
            finish()
        }
    }
}