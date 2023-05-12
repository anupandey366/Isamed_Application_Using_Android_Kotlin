package com.isamed.ui.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.isamed.adapters.AppointmentRecyclerAdapter
import com.isamed.adapters.LabResultRecyclerAdapter
import com.isamed.databinding.ActivityLabResultBinding
import com.isamed.modalClasses.AppointmentRecyclerModal
import com.isamed.modalClasses.LabResultRecyclerModal
import kotlinx.android.synthetic.main.activity_lab_result.*

class LabResultActivity : AppCompatActivity() {

    lateinit var binding: ActivityLabResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLabResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        iv_backLabResult.setOnClickListener {
            finish()
        }

        val arrLabResult = ArrayList<LabResultRecyclerModal>()

        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))
        arrLabResult.add(LabResultRecyclerModal("LIPASE","27/06/2013"))


        binding.recyclerViewLabResult.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL,false)

        val recyclerAppointmentAdapter = LabResultRecyclerAdapter(this,arrLabResult)
        binding.recyclerViewLabResult.adapter = recyclerAppointmentAdapter
    }
}