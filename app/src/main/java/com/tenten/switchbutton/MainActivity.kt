package com.tenten.switchbutton

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initClick()
    }

    private fun initClick() {
        switchX.setOnCheckedChangeListener { checked ->
            if (checked) Toast.makeText(this, "CheckedXX", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "UnCheckedXX", Toast.LENGTH_SHORT).show()
        }

        switchC.setOnCheckedChangeListener { checked ->
            if (checked) Toast.makeText(this, "CheckedCC", Toast.LENGTH_SHORT).show()
            else Toast.makeText(this, "UnCheckedCC", Toast.LENGTH_SHORT).show()
        }
    }
}
