package com.isamed.ui.fragments

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.isamed.R
import com.isamed.adapters.DocumentListAdapter
import com.isamed.interfaces.DetailsViewClick
import com.isamed.modalClasses.DocumentListRecyclerModal
import com.isamed.ui.activities.HomeActivity
import kotlinx.android.synthetic.main.bottom_sheet.view.*
import kotlinx.android.synthetic.main.fragment_doc.view.*
import kotlinx.android.synthetic.main.fragment_info.view.*

class DocFragment() : Fragment(), DetailsViewClick {

    lateinit var v : View
    private lateinit var dialog: BottomSheetDialog
    private lateinit var itemAdapter: DocumentListAdapter

    var setValue = "Insurance Card"


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val list= ArrayList<DocumentListRecyclerModal>()
        v = inflater.inflate(R.layout.fragment_doc, container, false)

        list.add(DocumentListRecyclerModal("Insurance Card"))
        list.add(DocumentListRecyclerModal("Referrals"))
        list.add(DocumentListRecyclerModal("Letters"))
        list.add(DocumentListRecyclerModal("Patient Consent Form"))
        list.add(DocumentListRecyclerModal("Patient Registration Form"))

        itemAdapter= DocumentListAdapter(v.context,list,this)

        v.tv_documentDropdown.setOnClickListener {
            openPopUp()
        }

        v.iv_homeDocuments.setOnClickListener {
            val intent = Intent(v.context, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
        }

        return v
    }

    @SuppressLint("ResourceAsColor")
    private fun openPopUp() {
        val dialogView= layoutInflater.inflate(R.layout.bottom_sheet,null)
        dialog= BottomSheetDialog(v.context,R.style.BottomSheetDialogTheme)
        dialog.setContentView(dialogView)

        val tvDone:TextView = dialogView.findViewById(R.id.tvDone)
        val tvCancel:TextView = dialogView.findViewById(R.id.tvCancel)

        tvCancel.setOnClickListener {
            dialog.dismiss()
        }


        tvDone.setOnClickListener {
            v.tv_documentDropdown.text = setValue
            dialog.dismiss()
        }


        dialogView.rvItem.adapter=itemAdapter
        dialog.show()
    }

    override fun setValue(name: String) {
        setValue = name
    }

}