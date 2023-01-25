package com.example.pemesanantravel_nusamulya.daftarUser

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.findNavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.pemesanantravel_nusamulya.LoginUserActivity
import com.example.pemesanantravel_nusamulya.R
import kotlinx.android.synthetic.main.activity_register_user.*
import kotlinx.android.synthetic.main.fragment_tambah_customer.*

class RegisterUserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_user)
        setupActionBarWithNavController(findNavController(R.id.main_fragment_daftar))

        keLogin.setOnClickListener {
            val intent = Intent(this, LoginUserActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.main_fragment_daftar)
        return super.onSupportNavigateUp()
    }
}