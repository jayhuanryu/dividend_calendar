package com.hita.dividend_calendar.ui.calendar

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.ktx.Firebase

class CalendarViewModel : ViewModel() {


    private val TAG = javaClass.simpleName
    private val database : DatabaseReference = Firebase.database.reference

    init {
        updateLocalDatabase()
    }

    private fun updateLocalDatabase() {
        database.addValueEventListener(object : ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {
                // update local database
                Log.d(TAG, "[updateLocalDatabase] >> ${snapshot}")
            }

            override fun onCancelled(error: DatabaseError) {
                Log.e(TAG, "[updateLocalDatabase] >> ${error.message}")
            }
        })
    }


}