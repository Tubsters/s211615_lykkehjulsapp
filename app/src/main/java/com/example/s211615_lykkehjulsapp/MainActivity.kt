package com.example.s211615_lykkehjulsapp

import android.app.GameManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.children

class MainActivity : AppCompatActivity() {

    private val gameManager = Gamemanager()

    private lateinit var newGame: Button
    private lateinit var won: TextView
    private lateinit var lost: TextView
    private lateinit var wordplacement: TextView
    private lateinit var letterused: TextView
    private lateinit var letterlayout: ConstraintLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        won = findViewById(R.id.won)
        lost = findViewById(R.id.lost)
        wordplacement = findViewById(R.id.wordPlacement)
        letterused = findViewById(R.id.letterused)
        letterlayout = findViewById(R.id.letterlayout)

        newGame.setOnClickListener { NewGame() }

    }
    val gameState = gameManager.NewGame()


    //letterlayout*


    private fun updateUI(gamestate: GameState){
        when (gamestate) {
            is GameState.Lost -> ShowGameLost(gamestate.wordtoguess)
            is GameState.Won -> ShowGameWon(gamestate.wordtoguess)
        }
    }
    private fun ShowGameLost(wordtoguess : String) {
        wordplacement.text = wordtoguess
        lost.visibility = View.VISIBLE
        letterused.visibility = View.GONE
    }
    private fun ShowGameWon(wordtoguess : String) {
        wordplacement.text = wordtoguess
        won.visibility = View.VISIBLE
        letterused.visibility = View.GONE
    }

    private fun NewGame() {
        lost.visibility = View.GONE
        won.visibility = View.GONE
        //val gameState = Gamemanager.NewGame()*
        letterlayout.visibility = View.VISIBLE
        letterlayout.children.forEach { letterview -> letterview.visibility = View.VISIBLE
        }
        updateUI(gameState)
    }
}
