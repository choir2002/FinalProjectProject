package com.example.pemesanantravel_nusamulya.pesanTravel.fragments

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.example.pemesanantravel_nusamulya.R
import com.example.pemesanantravel_nusamulya.pesanTravel.model.Pesan
import com.example.pemesanantravel_nusamulya.pesanTravel.viewmodel.PesanViewModel
import kotlinx.android.synthetic.main.custom_row.*
import kotlinx.android.synthetic.main.fragment_tambah.*
import kotlinx.android.synthetic.main.fragment_tambah.view.*
import org.w3c.dom.Text

class TambahFragment : Fragment() {
    private lateinit var mPesanViewModel: PesanViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tambah, container, false)
        mPesanViewModel = ViewModelProvider(this).get(PesanViewModel::class.java)

        view.pesan.setOnClickListener{
            masukkanDataKeDatabase()
        }
        return view
    }
    private fun masukkanDataKeDatabase(){
        val nama = edt_nama.text.toString()
        val email = edt_email.text.toString()
        val asal = edt_asal.text.toString()

//        // Create an ArrayAdapter
//        val asal = ArrayAdapter.createFromResource(this,
//            R.array.asal, android.R.layout.simple_spinner_item)
//        // Specify the layout to use when the list of choices appears
//        asal.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
//        // Apply the adapter to the spinner
//        edt_asal.adapter = asal

        val tujuan = edt_tujuan.text.toString()
        val tgl = edt_tgl.text.toString()
        val jumlah = edt_jumlah.text.toString()

        if(cekInput(nama,email,asal,tujuan,tgl,jumlah)){
            val pesan = Pesan(0,nama,email,asal,tujuan,tgl,jumlah)

            mPesanViewModel.tambahPesan (pesan)
            Toast.makeText(requireContext(),"Data Berhasil ditambahkan",Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.action_tambahFragment_to_menuUserActivity)
        }else {
            Toast.makeText(requireContext(),"Silakan isi dulu datanya",Toast.LENGTH_SHORT).show()
        }
    }

//    fun getValues(view: View) {
//        Toast.makeText(this, "Asal : " + edt_asal.selectedItem.toString() +
//                , Toast.LENGTH_LONG).show()
//    }
    private fun cekInput(
        nama:String,
        email:String,
        asal:String,
        tujuan:String,
        tgl:String,
        jumlah:String
    ):Boolean{
        return !(TextUtils.isEmpty(nama)&&TextUtils.isEmpty(email)&&TextUtils.isEmpty(asal)&&TextUtils.isEmpty(tujuan)&&TextUtils.isEmpty(tgl)&&TextUtils.isEmpty(jumlah))
    }

}