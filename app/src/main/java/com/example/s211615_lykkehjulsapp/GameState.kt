package com.example.s211615_lykkehjulsapp

import android.app.GameManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.s211615_lykkehjulsapp.Gamemanager

sealed class GameState {
    class running ()
    class Lost (val wordtoguess: String) : GameState()
    class Won (val wordtoguess: String) : GameState()

}