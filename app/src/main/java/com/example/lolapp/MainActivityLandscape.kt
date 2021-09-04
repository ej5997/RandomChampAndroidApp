package com.example.lolapp

import android.content.Intent
import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class MainActivityLandscape : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // init var for role selected
        var role: String
        // check orientation
        val orient = resources.configuration.orientation
        if(orient == Configuration.ORIENTATION_PORTRAIT){
            val o = Intent(this, MainActivity::class.java)
            startActivity(o)
        }
        // set content view
        setContentView(R.layout.activity_main_landscape)

        // on click function that sets activity to ChampActivity
        fun topList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "top"
            val i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun jglList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "jgl"
            val i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun midList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "mid"
            val i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun adcList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "adc"
            val i = Intent(this, ChampActivity::class.java)
            i.putExtra("role", role)
            startActivity(i)
        }
        // on click function that sets activity to ChampActivity
        fun supportList(v: View) {
            // set role and pass it to ChampActivity
            // start ChampActivity
            role = "supp"
            val i = Intent(this, ChampActivity::class.java)
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

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        if(newConfig.orientation == Configuration.ORIENTATION_PORTRAIT){
            val o = Intent(this, MainActivity::class.java)
            startActivity(o)
        }
    }
}
