package com.example.pemesanantravel_nusamulya.daftarUser.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pemesanantravel_nusamulya.R
import com.example.pemesanantravel_nusamulya.daftarUser.model.Daftar
import kotlinx.android.synthetic.main.custom_row_daftar.view.*


class ListAdapterDaftar : RecyclerView.Adapter<ListAdapterDaftar.MyViewHolder>(){
    private var daftarList = emptyList<Daftar>()
    class  MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapterDaftar.MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.custom_row_daftar,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curItem = daftarList[position]
        holder.itemView.tx_nama.text = "Nama : "+curItem.nama
        holder.itemView.tx_email.text = "Email : "+curItem.email
    }

    fun tampilkanData(daftar: List<Daftar>){
        this.daftarList = daftar
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return daftarList.size
    }
}