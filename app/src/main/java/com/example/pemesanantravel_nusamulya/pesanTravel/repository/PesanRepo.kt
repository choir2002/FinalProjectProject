package com.example.pemesanantravel_nusamulya.pesanTravel.repository

import androidx.lifecycle.LiveData
import com.example.pemesanantravel_nusamulya.pesanTravel.data.PesanDao
import com.example.pemesanantravel_nusamulya.pesanTravel.model.Pesan

class PesanRepo(private val pesanDao: PesanDao){
    val bacaSemuaData: LiveData<List<Pesan>> = pesanDao.bacaSemuaData()

    suspend fun tambahPesan(pesan: Pesan){
        pesanDao.tambahPesan(pesan)
    }
}