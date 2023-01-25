package com.example.pemesanantravel_nusamulya.pesanTravel.fragments

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.example.pemesanantravel_nusamulya.R
import com.example.pemesanantravel_nusamulya.pesanTravel.model.Pesan
import kotlinx.android.synthetic.main.custom_row.view.*


class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>(){
    private var PesanList = emptyList<Pesan>()
    class  MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListAdapter.MyViewHolder {
        return MyViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.custom_row,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curItem = PesanList[position]
        holder.itemView.tx_nama.text = "Nama : "+curItem.nama
        holder.itemView.tx_email.text = "Email : "+curItem.email
        holder.itemView.tx_asal.text = "Asal Sekolah : "+curItem.asal
        holder.itemView.tx_tujuan.text = "Alamat : "+curItem.tujuan
        holder.itemView.tx_tgl.text = "Tanggal Berangkat : "+curItem.tgl
        holder.itemView.tx_jumlah.text = "Agama : "+curItem.jumlah

    }

    fun tampilkanData(konsul: List<Pesan>){
        this.PesanList = konsul
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
        return PesanList.size
    }
}