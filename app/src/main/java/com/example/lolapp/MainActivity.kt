package com.example.lolapp

import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

@Suppress("SpellCheckingInspection")
class MainActivity : AppCompatActivity() {
    @Suppress("SpellCheckingInspection")
        override fun onCreate(savedInstanceState: Bundle?) {
        // init var for role selected
        var role = ""
        super.onCreate(savedInstanceState)
        // set view to main page
        setContentView(R.layout.activity_main)
        // on click function that sets activity to ChampActivity
        fun topList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "top"
            var i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun jglList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "jgl"
            var i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun midList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "mid"
            var i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun adcList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "adc"
            var i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun supportList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "supp"
            var i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }

        // onclick listener for top image
        val topImg = findViewById<ImageView>(R.id.top)
        topImg.setOnClickListener(::topList)
        // onclick listener for jgl image
        val jglImg = findViewById<ImageView>(R.id.jungle)
        jglImg.setOnClickListener(::jglList)
        // onclick listener for mid image
        val midImg = findViewById<ImageView>(R.id.mid)
        midImg.setOnClickListener(::midList)
        // onclick listener for adc image
        val adcImg = findViewById<ImageView>(R.id.adc)
        adcImg.setOnClickListener(::adcList)
        // onclick listener for supp image
        val suppImg = findViewById<ImageView>(R.id.support)
        suppImg.setOnClickListener(::supportList)
    }
}