package com.isamed.adapters

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.isamed.R
import com.isamed.interfaces.DetailsViewClick
import com.isamed.modalClasses.DocumentListRecyclerModal
import com.isamed.ui.activities.ViewAppointmentDetailsActivity
import kotlinx.android.synthetic.main.appointment_details_recycler_layout.view.*
import kotlinx.android.synthetic.main.list_item.view.*

class DocumentListAdapter(val context: Context, private var mList: ArrayList<DocumentListRecyclerModal>, val click: DetailsViewClick) : RecyclerView.Adapter<DocumentListAdapter.ViewHolder>() {
    private var selectedItemPosition: Int = 0
    class ViewHolder(ItemView: View): RecyclerView.ViewHolder(ItemView){
        val item= itemView.tvItem
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view= LayoutInflater.from(parent.context).inflate(R.layout.list_item,parent,false)
//        viewFrag= LayoutInflater.from(parent.context).inflate(R.layout.fragment_doc,parent,false)

        return ViewHolder(view)
    }

    @SuppressLint("ResourceAsColor")
    override fun onBindViewHolder(holder: ViewHolder, @SuppressLint("RecyclerView") position: Int) {
        holder.item.text = mList[position].docName

        holder.itemView.setOnClickListener {
            click.setValue(holder.item.text.toString())
            selectedItemPosition = position
            notifyDataSetChanged()
        }
        if(selectedItemPosition == position)
            holder.item.setBackgroundColor(Color.parseColor("#ededed"))
        else
            holder.item.setBackgroundColor(Color.parseColor("#ffffff"))

        /*holder.item.text = mList[position].docName

//        val item = mList[position]
//        holder.item.text= item.toString()
*/

    }

    override fun getItemCount(): Int {
        return mList.size
    }






}