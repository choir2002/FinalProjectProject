package com.example.pemesanantravel_nusamulya.daftarUser.fragments

import android.os.Bundle
import android.text.TextUtils
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController

import com.example.pemesanantravel_nusamulya.R
import com.example.pemesanantravel_nusamulya.daftarUser.model.Daftar
import com.example.pemesanantravel_nusamulya.daftarUser.viewmodel.DaftarViewModel
import kotlinx.android.synthetic.main.custom_row_daftar.*
import kotlinx.android.synthetic.main.fragment_tambah_customer.*
import kotlinx.android.synthetic.main.fragment_tambah_customer.view.*
import org.w3c.dom.Text

class TambahCustomer : Fragment() {
    private lateinit var mDaftarViewModel: DaftarViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tambah_customer, container, false)
        mDaftarViewModel = ViewModelProvider(this).get(DaftarViewModel::class.java)

        view.daftar.setOnClickListener{
            masukkanDataKeDatabase()
        }
        return view
    }
    private fun masukkanDataKeDatabase(){
        val nama = edt_nama.text.toString()
        val email = edt_email.text.toString()

        if(cekInput(nama,email)){
            val daftar = Daftar(0,nama,email)

            mDaftarViewModel.tambahDaftar(daftar)
            Toast.makeText(requireContext(),"Data Berhasil ditambahkan",Toast.LENGTH_SHORT).show()

            findNavController().navigate(R.id.action_tambahFragment_to_menuUserActivity)
        }else {
            Toast.makeText(requireContext(),"Silakan isi dulu datanya",Toast.LENGTH_SHORT).show()
        }
    }
    private fun cekInput(
        nama:String,
        email:String
    ):Boolean{
        return !(TextUtils.isEmpty(nama)&&TextUtils.isEmpty(email))
    }

}