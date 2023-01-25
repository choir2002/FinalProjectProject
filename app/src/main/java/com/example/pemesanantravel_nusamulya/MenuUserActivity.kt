package com.example.pemesanantravel_nusamulya

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.pemesanantravel_nusamulya.pesanTravel.PesanUserActivity
import com.example.pemesanantravel_nusamulya.pesanTravel.RiwayatPesanAdminActivity
import com.example.pemesanantravel_nusamulya.pesanTravel.profil
import kotlinx.android.synthetic.main.activity_menu_user.*

class MenuUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_user)

        pesan.setOnClickListener {
            val intent = Intent(this, PesanUserActivity::class.java)
            startActivity(intent)
        }

        riwayat.setOnClickListener {
            val intent = Intent(this, RiwayatPesanAdminActivity::class.java)
            startActivity(intent)
        }

        kontak.setOnClickListener {
            val intent = Intent(this, Kontak::class.java)
            startActivity(intent)
        }

        lokasi.setOnClickListener {
            val intent = Intent(this, MapsActivity::class.java)
            startActivity(intent)
        }

        keluar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        imgprofil.setOnClickListener {
            val intent = Intent(this, profil::class.java)
            startActivity(intent)
        }
        visi.setOnClickListener {
            val intent = Intent(this, VisidanMisi::class.java)
            startActivity(intent)
        }


    }
}