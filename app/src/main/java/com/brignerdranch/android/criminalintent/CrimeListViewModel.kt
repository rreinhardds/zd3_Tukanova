package com.brignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel:ViewModel() {
    val crimes = mutableListOf<Crime>()

    init {
        for (i in 0..100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
}