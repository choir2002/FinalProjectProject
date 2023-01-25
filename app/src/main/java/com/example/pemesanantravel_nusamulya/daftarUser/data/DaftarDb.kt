package com.example.pemesanantravel_nusamulya.daftarUser.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pemesanantravel_nusamulya.daftarUser.model.Daftar
import com.example.pemesanantravel_nusamulya.daftarUser.data.DaftarDao

@Database(entities = [Daftar::class],version = 1,exportSchema = false)
abstract class DaftarDb : RoomDatabase(){

    abstract fun DaftarDao(): DaftarDao

    companion object{
        @Volatile
        private var INSTANCE: DaftarDb? = null

        fun getDb(context: Context):DaftarDb{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DaftarDb::class.java,
                    "daftar_user"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}