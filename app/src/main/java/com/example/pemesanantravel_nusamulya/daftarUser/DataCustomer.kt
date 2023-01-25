package com.example.pemesanantravel_nusamulya.daftarUser

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.pemesanantravel_nusamulya.R

class DataCustomer : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_customer)
        setupActionBarWithNavController(findNavController(R.id.main_fragment_customer))
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.main_fragment_customer)
        return super.onSupportNavigateUp()
    }
}