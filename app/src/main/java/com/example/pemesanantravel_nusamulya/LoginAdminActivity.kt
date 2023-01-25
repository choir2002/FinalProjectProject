package com.example.pemesanantravel_nusamulya

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

import kotlinx.android.synthetic.main.activity_login_admin.*
import kotlinx.android.synthetic.main.activity_login_admin.email
import kotlinx.android.synthetic.main.activity_login_admin.login
import kotlinx.android.synthetic.main.activity_login_admin.password
import kotlinx.android.synthetic.main.activity_login_user.*
import kotlinx.android.synthetic.main.activity_menu_admin.*


class LoginAdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_admin)

        login.setOnClickListener {
            val email = email.text.toString()
            val password = password.text.toString()
            val builder = AlertDialog.Builder(this)
            if (email.isEmpty()|| password.isEmpty()) {
                Toast.makeText(this, "Please Insert Email and Password", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            if(email == "chobib@gmail.com" || password == "1234"){
                val progressDialog = ProgressDialog(this,
                    R.style.Theme_MaterialComponents_Light_Dialog)
                progressDialog.isIndeterminate = true
                progressDialog.setMessage("Loading...")
                progressDialog.show()
                val intent = Intent (this, MenuAdminActivity::class.java)
                startActivity(intent)
                finish()
            }
            else {
                //jika login gagal
                builder.setMessage("Username atau Password Anda salah!")
                    .setNegativeButton("Retry", null).create().show();
            }
        }
    }
}