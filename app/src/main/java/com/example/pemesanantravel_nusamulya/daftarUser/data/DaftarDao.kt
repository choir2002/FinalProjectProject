package com.example.pemesanantravel_nusamulya.daftarUser.data

import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.pemesanantravel_nusamulya.daftarUser.model.Daftar

@Dao
interface DaftarDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun tambahDaftar(daftar: Daftar)

    @Query("SELECT * FROM daftar_user ORDER BY id ASC")
    fun bacaSemuaData(): LiveData<List<Daftar>>
    
    @Query("DELETE FROM daftar_user")
    suspend fun hapusSemua()
}