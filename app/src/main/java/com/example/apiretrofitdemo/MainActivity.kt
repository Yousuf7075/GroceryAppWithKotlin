package com.example.apiretrofitdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apiretrofitdemo.ui.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val transaction = supportFragmentManager.beginTransaction();
        transaction.add(R.id.fragmentContainer, HomeFragment())
        transaction.commit()
    }
}
