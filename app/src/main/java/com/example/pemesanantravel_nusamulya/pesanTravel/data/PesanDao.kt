package com.example.pemesanantravel_nusamulya.pesanTravel.data
import androidx.lifecycle.LiveData
import androidx.room.*
import com.example.pemesanantravel_nusamulya.pesanTravel.model.Pesan

@Dao
interface PesanDao{

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun tambahPesan(konsul: Pesan)

    @Query("SELECT * FROM pesan ORDER BY id ASC")
    fun bacaSemuaData(): LiveData<List<Pesan>>

    @Query("DELETE FROM pesan")
    suspend fun hapusSemua()
}