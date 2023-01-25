package com.example.pemesanantravel_nusamulya.pesanTravel.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.pemesanantravel_nusamulya.pesanTravel.model.Pesan

@Database(entities = [Pesan::class],version = 1,exportSchema = false)
abstract class PesanDb : RoomDatabase(){

    abstract fun PesanDao(): PesanDao

    companion object{
        @Volatile
        private var INSTANCE: PesanDb? = null

        fun getDb(context: Context):PesanDb{
            val tempInstance = INSTANCE
            if(tempInstance != null){
                return tempInstance
            }
            synchronized(this){
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PesanDb::class.java,
                    "pesan"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}