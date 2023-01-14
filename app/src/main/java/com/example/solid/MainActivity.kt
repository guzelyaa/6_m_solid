package com.example.solid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.solid.click.OnClick

class MainActivity : AppCompatActivity(), OnClick {

    private lateinit var animals: ArrayList<Animal>

    //2: Open-Closed Principle
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        animals = arrayListOf(Lion(), Mouse(), Horse(), Snake(), Dog())
        makeAnimalSound()
        animalLegCount()
    }

    private fun makeAnimalSound() {
        for (i in animals) {
            Log.e("ololo", "makeAnimalSound: " + i.makeVoice())
        }
    }

    //3: Liskov Substitution Principle
    private fun animalLegCount(){
        for (i in animals){
            Log.e("ololo", "LegCount is " + i.legCount())
        }
    }

    override fun onClick() {


    }
}