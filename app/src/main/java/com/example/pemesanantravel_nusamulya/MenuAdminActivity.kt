package com.example.pemesanantravel_nusamulya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pemesanantravel_nusamulya.daftarUser.DataCustomer


import com.example.pemesanantravel_nusamulya.pesanTravel.RiwayatPesanAdminActivity
import kotlinx.android.synthetic.main.activity_menu_admin.*
import kotlinx.android.synthetic.main.activity_menu_user.*

class MenuAdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_admin)



        riwytPemesanan.setOnClickListener {
            val intent = Intent(this, RiwayatPesanAdminActivity::class.java)
            startActivity(intent)
        }



        customer.setOnClickListener {
            val intent = Intent(this, DataCustomer::class.java)
            startActivity(intent)
        }
        keluar2.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}