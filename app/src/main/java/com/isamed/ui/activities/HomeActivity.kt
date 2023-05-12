package com.isamed.ui.activities

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.isamed.R
import com.isamed.databinding.ActivityHomeBinding
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {

    lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.llSchedule.setOnClickListener {
            val intent = Intent(this@HomeActivity,AppointmentList::class.java)
            startActivity(intent)
        }

        binding.llSearch.setOnClickListener {
            val intent = Intent(this@HomeActivity,SearchForPatientActivity::class.java)
            startActivity(intent)
        }

        binding.llPrescription.setOnClickListener {
            val intent = Intent(this@HomeActivity,FilterActivity::class.java)
            startActivity(intent)
        }

        binding.llTestResults.setOnClickListener {
            val intent = Intent(this@HomeActivity,FilterActivity::class.java)
            startActivity(intent)
        }

        binding.llLabOrder.setOnClickListener {
            val intent = Intent(this@HomeActivity,FilterActivity::class.java)
            startActivity(intent)
        }

        binding.llSonograms.setOnClickListener {
            val intent = Intent(this@HomeActivity,FilterActivity::class.java)
            intent.putExtra("page","sonogramToFilter")
            startActivity(intent)
        }

        /////////////////////////////////

        binding.ivMenu.setOnClickListener {
            val popupMenu = PopupMenu(this@HomeActivity, iv_menu)
            popupMenu.menuInflater.inflate(R.menu.nav_menu, popupMenu.menu)
            popupMenu.setOnMenuItemClickListener { menuItem ->
                onOptionsItemSelected(menuItem)
                true
            }
            popupMenu.show()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.nav_ContactUs -> {
                contactUs()
                true
            }
            R.id.nav_LogOut -> {
                logOut()
                true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun contactUs() {
        val intent=Intent(this@HomeActivity,ContactUsActivity::class.java)
        startActivity(intent)
    }

    fun logOut() {
        val intent=Intent(this@HomeActivity,LoginActivity::class.java)
        finishAffinity()
        startActivity(intent)
    }
}