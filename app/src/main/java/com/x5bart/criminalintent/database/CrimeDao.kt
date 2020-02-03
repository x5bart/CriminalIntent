package com.x5bart.criminalintent.database

import androidx.room.Dao
import androidx.room.Query
import com.x5bart.criminalintent.Crime
import java.util.*

@Dao
interface CrimeDao {

    @Query("SELECT * FROM crime")
    fun getCrimes(): List<Crime>

    @Query("SELECT * FROM crime WHERE id=(:id)")
    fun getCrime(id: UUID): Crime?
}