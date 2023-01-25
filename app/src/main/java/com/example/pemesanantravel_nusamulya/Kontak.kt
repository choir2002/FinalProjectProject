package com.example.pemesanantravel_nusamulya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_visidan_misi.*

class Kontak : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kontak)

        kembali.setOnClickListener {
            val intent = Intent(this, MenuUserActivity::class.java)
            startActivity(intent)
        }
    }
}