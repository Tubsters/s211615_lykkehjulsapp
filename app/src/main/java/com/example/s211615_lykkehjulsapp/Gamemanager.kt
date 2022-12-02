package com.example.s211615_lykkehjulsapp

import android.app.GameManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.s211615_lykkehjulsapp.Data.Catagories
import com.example.s211615_lykkehjulsapp.Data.Data
import com.example.s211615_lykkehjulsapp.GameState
import kotlin.random.Random

class Gamemanager {
    private var usedletters: String = ""
    private lateinit var underscorefield: String
    private lateinit var Wordtoguess: String
    private val maxlife = 5
    private var lifeused = 0

    fun NewGame(): GameState {
        usedletters = ""
        lifeused = 0
        val randomIndex = Random.nextInt(0, Data.wordlist.size)
        Wordtoguess = Data.wordlist[randomIndex].toString()
        generatefields(Wordtoguess)
        return getGameState()
    }

    fun generatefields(word: String) {
        val sb = StringBuilder()
        word.forEach { sb.append("_") }
        underscorefield = sb.toString()
    }


    private fun getGameState(): GameState {
        if (underscorefield.equals(Wordtoguess, true)) {
            return GameState.Won(Wordtoguess)
        }
        if (lifeused == maxlife) {
            return GameState.Lost(Wordtoguess)
        }
        return GameState.Lost(Wordtoguess)
    }
}