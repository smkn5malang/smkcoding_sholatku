package com.mzf.sholatkuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button_baca.setOnClickListener {
            navigasiKeMenu()
        }
    }

    private fun navigasiKeMenu(){
        val intent = Intent (this, layout2::class.java)
        startActivity(intent)
    }


}
