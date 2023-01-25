package com.example.pemesanantravel_nusamulya.daftarUser.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "daftar_user")
data class Daftar (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nama: String,
    val email: String
): Parcelable