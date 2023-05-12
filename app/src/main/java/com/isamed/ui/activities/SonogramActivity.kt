package com.isamed.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.isamed.R
import kotlinx.android.synthetic.main.activity_sonogram.*

class SonogramActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sonogram)

        iv_backSonogram.setOnClickListener {
            finish()
        }
    }
}