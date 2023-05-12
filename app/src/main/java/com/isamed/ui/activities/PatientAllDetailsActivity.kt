package com.isamed.ui.activities

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import com.isamed.R
import com.isamed.databinding.ActivityPatientAllDetailsBinding
import com.isamed.ui.fragments.*

private val infoFragment=  InfoFragment()
private val appointmentsFragment=  AppointmentFragment()
private val docFragment=  DocFragment()
private val labOrderFragment=  LabOrderFragment()
private val testResultsFragment=  TestResultsFragment()
private val prescriptionFragment=  PrescriptionFragment()
private val paymentFragment=  PaymentFragment()


class PatientAllDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityPatientAllDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPatientAllDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        replaceFragment(infoFragment)
        changeTabBG(binding.llNav1)

        binding.llNav1.setOnClickListener {
            replaceFragment(infoFragment)
            changeTabBG(binding.llNav1)
        }
        binding.llNav2.setOnClickListener {
            replaceFragment(appointmentsFragment)
            changeTabBG(binding.llNav2)
        }
        binding.llNav3.setOnClickListener {
            replaceFragment(docFragment)
            changeTabBG(binding.llNav3)
        }
        binding.llNav4.setOnClickListener {
            replaceFragment(labOrderFragment)
            changeTabBG(binding.llNav4)
        }
        binding.llNav5.setOnClickListener {
            replaceFragment(testResultsFragment)
            changeTabBG(binding.llNav5)
        }
        binding.llNav6.setOnClickListener {
            replaceFragment(prescriptionFragment)
            changeTabBG(binding.llNav6)
        }
        binding.llNav7.setOnClickListener {
            replaceFragment(paymentFragment)
            changeTabBG(binding.llNav7)
        }
    }


    private fun changeTabBG(llSelectedTab: LinearLayout) {
        binding.llNav1.setBackgroundResource(R.drawable.tab_false)
        binding.ivNavItemImage1.setImageResource(R.drawable.info_icon_gray)
        binding.tvNavItemName1.setTextColor(Color.parseColor("#a2a2a2"));

        binding.llNav2.setBackgroundResource(R.drawable.tab_false)
        binding.ivNavItemImage2.setImageResource(R.drawable.appointment_icon_gray)
        binding.tvNavItemName2.setTextColor(Color.parseColor("#a2a2a2"));

        binding.llNav3.setBackgroundResource(R.drawable.tab_false)
        binding.ivNavItemImage3.setImageResource(R.drawable.doc_icon_gray)
        binding.tvNavItemName3.setTextColor(Color.parseColor("#a2a2a2"));

        binding.llNav4.setBackgroundResource(R.drawable.tab_false)
        binding.ivNavItemImage4.setImageResource(R.drawable.lab_ord_icon_gray)
        binding.tvNavItemName4.setTextColor(Color.parseColor("#a2a2a2"));

        binding.llNav5.setBackgroundResource(R.drawable.tab_false)
        binding.ivNavItemImage5.setImageResource(R.drawable.test_result_icon_gray)
        binding.tvNavItemName5.setTextColor(Color.parseColor("#a2a2a2"));

        binding.llNav6.setBackgroundResource(R.drawable.tab_false)
        binding.ivNavItemImage6.setImageResource(R.drawable.prescription_icon_gray)
        binding.tvNavItemName6.setTextColor(Color.parseColor("#a2a2a2"));

        binding.llNav7.setBackgroundResource(R.drawable.tab_false)
        binding.ivNavItemImage7.setImageResource(R.drawable.pay_icon_gray)
        binding.tvNavItemName7.setTextColor(Color.parseColor("#a2a2a2"));


        when(llSelectedTab.id){
            R.id.ll_nav1 -> {
                binding.llNav1.setBackgroundResource(R.drawable.tab_true)
                binding.ivNavItemImage1.setImageResource(R.drawable.info_icon_white)
                binding.tvNavItemName1.setTextColor(Color.parseColor("#ffffff"));
            }
            R.id.ll_nav2 -> {
                binding.llNav2.setBackgroundResource(R.drawable.tab_true)
                binding.ivNavItemImage2.setImageResource(R.drawable.appointment_icon_white)
                binding.tvNavItemName2.setTextColor(Color.parseColor("#ffffff"));
            }
            R.id.ll_nav3 -> {
                binding.llNav3.setBackgroundResource(R.drawable.tab_true)
                binding.ivNavItemImage3.setImageResource(R.drawable.doc_icon_white)
                binding.tvNavItemName3.setTextColor(Color.parseColor("#ffffff"));
            }
            R.id.ll_nav4 -> {
                binding.llNav4.setBackgroundResource(R.drawable.tab_true)
                binding.ivNavItemImage4.setImageResource(R.drawable.lab_ord_icon_white)
                binding.tvNavItemName4.setTextColor(Color.parseColor("#ffffff"));
            }
            R.id.ll_nav5 -> {
                binding.llNav5.setBackgroundResource(R.drawable.tab_true)
                binding.ivNavItemImage5.setImageResource(R.drawable.test_result_icon_white)
                binding.tvNavItemName5.setTextColor(Color.parseColor("#ffffff"));
            }
            R.id.ll_nav6 -> {
                binding.llNav6.setBackgroundResource(R.drawable.tab_true)
                binding.ivNavItemImage6.setImageResource(R.drawable.prescription_icon_white)
                binding.tvNavItemName6.setTextColor(Color.parseColor("#ffffff"));
            }
            R.id.ll_nav7 -> {
                binding.llNav7.setBackgroundResource(R.drawable.tab_true)
                binding.ivNavItemImage7.setImageResource(R.drawable.pay_icon_white)
                binding.tvNavItemName7.setTextColor(Color.parseColor("#ffffff"));
            }
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if(fragment!= null)
        {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.home_frame,fragment)
            transaction.commit()
        }
    }
}