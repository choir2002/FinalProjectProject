package com.example.pemesanantravel_nusamulya.daftarUser.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.viewModelScope
import com.example.pemesanantravel_nusamulya.daftarUser.data.DaftarDb
import com.example.pemesanantravel_nusamulya.daftarUser.model.Daftar
import com.example.pemesanantravel_nusamulya.daftarUser.repository.DaftarRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DaftarViewModel(application: Application): AndroidViewModel(application) {
    val bacaSemuaData: LiveData<List<Daftar>>
    private val repo: DaftarRepo

    init {
        val DaftarDao = DaftarDb.getDb(application).DaftarDao()
        repo = DaftarRepo(DaftarDao)
        bacaSemuaData = repo.bacaSemuaData
    }
    fun tambahDaftar(daftar: Daftar){
        viewModelScope.launch(Dispatchers.IO){
            repo.tambahDaftar(daftar)
        }
    }
}