package com.example.pemesanantravel_nusamulya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.pemesanantravel_nusamulya.pesanTravel.PesanUserActivity
import kotlinx.android.synthetic.main.activity_menu_user.*
import kotlinx.android.synthetic.main.activity_visidan_misi.*

class VisidanMisi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_visidan_misi)

        kembali.setOnClickListener {
            val intent = Intent(this, MenuUserActivity::class.java)
            startActivity(intent)
        }
    }
}