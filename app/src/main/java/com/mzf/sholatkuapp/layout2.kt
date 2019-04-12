package com.mzf.sholatkuapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_layout2.*

class layout2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout2)

        button_rukun_iman.setOnClickListener {
            navigasiKeMenu2()
    }
        button_rukun_islam.setOnClickListener {
            navigasiKeMenu3()
        }
    }


    private fun navigasiKeMenu2(){
        val intent = Intent (this, layout3::class.java)
        startActivity(intent)
    }
    private fun navigasiKeMenu3(){
        val intent = Intent (this, layout4::class.java)
        startActivity(intent)
    }
}

