package com.example.memorygame

import android.os.Bundle
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import com.example.memorygame.R.id.*
import com.example.memorygame.R.drawable.*

class MainActivity : AppCompatActivity() {

    //Declare an instance variable with type of ImageButton outside of onCreate() so it can be accessed by other methods
    private lateinit var buttons: ArrayList<ImageButton>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val images: MutableList<Int> = mutableListOf(bird, butterfly, fish, flask, microscope, testtube)

        buttons = arrayListOf<ImageButton>(button1, button2, button3, button4, button5, button6, button7, button8, button9, button10, button11, button12)

        images.shuffle()

        for (i in 0..11) {
            buttons.(i).setBackgroundResource(butterfly)
        }

    }
}