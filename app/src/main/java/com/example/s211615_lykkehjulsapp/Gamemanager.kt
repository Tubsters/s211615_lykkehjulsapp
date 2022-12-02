package com.example.s211615_lykkehjulsapp

import android.app.GameManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.s211615_lykkehjulsapp.Data.Catagories
import com.example.s211615_lykkehjulsapp.Data.Data

import kotlin.random.Random

class Gamemanager :  {

    private var usedletters: String = ""
    private lateinit var Wordtoguess: String
    private val life = 5
    private var lifeused = 0

    fun newgame(): Gamestate {

        usedletters = ""
        lifeused = 0

       val randomIndex = Random.nextInt(0, Data.wordlist.size)
        Wordtoguess = Data.wordlist[randomIndex].toString()
        return getGameState()
    }
}