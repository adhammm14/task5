package com.example.recycleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class FruitDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fruit_details)

        val image = findViewById<ImageView>(R.id.f_image)
        val name = findViewById<TextView>(R.id.f_name)
        val description = findViewById<TextView>(R.id.f_description)

        val f = intent.getParcelableExtra<Fruit>("FRUIT")

        if (f != null) {
            name.text = f.fruitName
            description.text = f.shortDescription
            image.setImageResource(f.fruitImage)

        }
    }
}