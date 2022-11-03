package com.je.supersu.white

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.je.supersu.R
import kotlinx.android.synthetic.main.activity_finally.*

class Finally : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finally)

        againBtn.setOnClickListener{
            startActivity(Intent(this, Game::class.java))
        }
    }
}