package com.songgrig.playthepiano

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        textView.animate().translationY(-1600f).setDuration(1000).setStartDelay(4000)
        lottie.animate().translationY(1400f).setDuration(1000).setStartDelay(4000)
    }
}
