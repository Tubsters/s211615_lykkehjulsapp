package com.example.s211615_lykkehjulsapp

import android.app.GameManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class GameState : AppCompatActivity() {

    private val gameManager = GameManager()
    private lateinit var newGame: Button
    private lateinit var spinbutton: Button
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

        newGame.setOnClickListener()
        spinbutton.setOnClickListener()
    }
}