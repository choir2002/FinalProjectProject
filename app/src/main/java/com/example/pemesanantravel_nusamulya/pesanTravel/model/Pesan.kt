package com.example.pemesanantravel_nusamulya.pesanTravel.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize

@Parcelize
@Entity(tableName = "pesan")
data class Pesan (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val nama: String,
    val email: String,
    val asal: String,
    val tujuan: String,
    val tgl: String,
    val jumlah: String
): Parcelable