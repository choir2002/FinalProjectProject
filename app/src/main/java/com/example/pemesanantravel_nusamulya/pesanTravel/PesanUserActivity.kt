package com.example.pemesanantravel_nusamulya.pesanTravel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.pemesanantravel_nusamulya.R

class PesanUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pesan_user)
        setupActionBarWithNavController(findNavController(R.id.main_fragment))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.main_fragment)
        return super.onSupportNavigateUp()
    }
}