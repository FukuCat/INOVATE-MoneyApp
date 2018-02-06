package org.moneyapp.inovate.moneyapp.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import org.moneyapp.inovate.moneyapp.R

/*
* Splash screen
* Initialize singleton classes and general preparation before actually opening the app.
* */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
    }
}
