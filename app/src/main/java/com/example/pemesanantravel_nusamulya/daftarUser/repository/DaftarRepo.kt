package com.example.pemesanantravel_nusamulya.daftarUser.repository

import androidx.lifecycle.LiveData
import com.example.pemesanantravel_nusamulya.daftarUser.data.DaftarDao
import com.example.pemesanantravel_nusamulya.daftarUser.model.Daftar

class DaftarRepo(private val daftarDao: DaftarDao){
    val bacaSemuaData: LiveData<List<Daftar>> = daftarDao.bacaSemuaData()

    suspend fun tambahDaftar(daftar: Daftar){
        daftarDao.tambahDaftar(daftar)
    }
}