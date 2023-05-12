package com.isamed.ui.activities
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.text.InputFilter
import android.util.Patterns
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import com.isamed.databinding.ActivityForgotPasswordBinding

class ForgotPasswordActivity : AppCompatActivity() {
    lateinit var binding: ActivityForgotPasswordBinding
    var flagGo=0
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityForgotPasswordBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        val maxEmailLength =50
        binding.etUserEmail.filters= arrayOf<InputFilter>(InputFilter.LengthFilter(maxEmailLength))

        binding.etUserEmail.doOnTextChanged { text, start, before, count ->
            funValidateEmail()
        }

        binding.ivBack.setOnClickListener {
            finish()
        }

        binding.btnSendLink.setOnClickListener {
            funValidate()
        }



    }

    private fun funValidate() {
        flagGo=0
        funValidateEmail()
        if (flagGo == 1) {

            Toast.makeText(this, "Check your mail", Toast.LENGTH_SHORT).show()
            val intent = Intent(this@ForgotPasswordActivity, LoginActivity::class.java)
            finishAffinity()
            startActivity(intent)

        }
    }

    private fun funValidateEmail() {
        if (binding.etUserEmail.text.toString().isEmpty()||!Patterns.EMAIL_ADDRESS.matcher(binding.etUserEmail.text.toString()).matches())
        {binding.vEmail.setBackgroundColor(Color.parseColor("#d71f2b"))
            binding.tvValidateUserEmail.isVisible=true
            binding.tvValidateUserEmail.text="*Please enter valid email."

        }
        else
        {
            binding.vEmail.setBackgroundColor(Color.parseColor("#2742b4"))
            binding.tvValidateUserEmail.isVisible=false
            flagGo++

        }
    }
}