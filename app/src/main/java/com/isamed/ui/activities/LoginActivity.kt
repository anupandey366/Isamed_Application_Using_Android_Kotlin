package com.isamed.ui.activities

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.widget.LinearLayout
import android.widget.PopupWindow
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.core.widget.doOnTextChanged
import com.isamed.R
import com.isamed.databinding.ActivityLoginBinding
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    lateinit var binding: ActivityLoginBinding
    var flagGo=0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.etUserID.doOnTextChanged { text, start, before, count ->
            ValidateUserId()
        }

        binding.etUserPassword.doOnTextChanged { text, start, before, count ->
            ValidateUserPassword()
        }

        binding.tvLoginButton.setOnClickListener{
            ValidateLogin()
        }

        binding.tvForgot.setOnClickListener {
            val intent = Intent(this@LoginActivity,ForgotPasswordActivity::class.java)
            startActivity(intent)
        }

        binding.tvTerms.setOnClickListener {
            val intent = Intent(this@LoginActivity,TermsAndConditionsActivity::class.java)
            startActivity(intent)
        }



    }

    private fun ValidateUserId() {

        if (binding.etUserID.text.toString().isEmpty())
        {
            binding.vUser.setBackgroundColor(Color.parseColor("#d71f2b"))
            binding.tvValidateUserId.isVisible=true
            binding.tvValidateUserId.text="*Please enter your username"

        }

        else
        {
            binding.vUser.setBackgroundColor(Color.parseColor("#2742b4"))
            binding.tvValidateUserId.isVisible=false
            flagGo++
        }
    }

    private fun ValidateUserPassword() {

        if (binding.etUserPassword.text.toString().isEmpty())
        {
            binding.vPassword.setBackgroundColor(Color.parseColor("#d71f2b"))
            binding.tvValidateUserPassword.isVisible=true
            binding.tvValidateUserPassword.text="*Please enter your password"

        }

        else
        {
            binding.vPassword.setBackgroundColor(Color.parseColor("#2742b4"))
            binding.tvValidateUserPassword.isVisible=false
            flagGo++
        }
    }

    private fun ValidateTerms() {


        if (binding.cbTerms.isChecked)
        {
            flagGo++
        }
        else if(!binding.cbTerms.isChecked && binding.etUserID.text.isNotEmpty() && binding.etUserPassword.text.isNotEmpty())
        {
            ValidateTermsPopUp(binding.tvLoginButton,"Please check terms and conditions.")
        }
    }

    private fun ValidateLogin() {

        var msg="Wrong input!!"
        flagGo=0
        ValidateUserId()
        ValidateUserPassword()
        ValidateTerms()

        if (flagGo == 3) {
            val intent = Intent(this@LoginActivity, HomeActivity::class.java)
            finish()
            startActivity(intent)
        }

    }
    fun ValidateTermsPopUp(view: View?, msg : String) {


        // step 1
        val inflater = getSystemService(LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val popupView = inflater.inflate(R.layout.terms_popup_layout, null)

        var txtView: TextView = popupView.findViewById(R.id.tv_popupMsg)
        var okBtnTxt: TextView = popupView.findViewById(R.id.tv_okButton)



        txtView.text=msg
        // step 2
        val wid = LinearLayout.LayoutParams.WRAP_CONTENT
        val high = LinearLayout.LayoutParams.WRAP_CONTENT
        val focus= true
        val popupWindow = PopupWindow(popupView, wid, high, focus)

        // step 3
        popupWindow.showAtLocation(view, Gravity.CENTER, 0, 0)
        okBtnTxt.setOnClickListener {
            popupWindow.dismiss()
        }

    }
}