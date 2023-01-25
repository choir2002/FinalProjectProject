package com.example.pemesanantravel_nusamulya.pesanTravel.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.pemesanantravel_nusamulya.pesanTravel.data.PesanDb
import com.example.pemesanantravel_nusamulya.pesanTravel.model.Pesan
import com.example.pemesanantravel_nusamulya.pesanTravel.repository.PesanRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class PesanViewModel(application: Application): AndroidViewModel(application) {
    val bacaSemuaData: LiveData<List<Pesan>>
    private val repo: PesanRepo

    init {
        val PesanDao = PesanDb.getDb(application).PesanDao()
        repo = PesanRepo(PesanDao)
        bacaSemuaData = repo.bacaSemuaData
    }
    fun tambahPesan(jadwal: Pesan){
        viewModelScope.launch(Dispatchers.IO){
            repo.tambahPesan(jadwal)
        }
    }
}