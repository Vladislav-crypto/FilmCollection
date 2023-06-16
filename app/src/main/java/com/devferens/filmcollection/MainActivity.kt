package com.devferens.filmcollection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.devferens.filmcollection.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        initButtons(view)

    }

    private fun initButtons(view: View) {
        binding.buttonMenu.setOnClickListener {
            Toast.makeText(this, "Меню", Toast.LENGTH_SHORT).show()
        }
        binding.buttonFav.setOnClickListener {
            Toast.makeText(this, "Избранное", Toast.LENGTH_SHORT).show()
        }
        binding.buttonWatchLater.setOnClickListener {
            Toast.makeText(this, "Посмотреть позже", Toast.LENGTH_SHORT).show()
        }
        binding.buttonSelections.setOnClickListener {
            Toast.makeText(this, "Подборки", Toast.LENGTH_SHORT).show()
        }
        binding.buttonSettings.setOnClickListener {
            Toast.makeText(this, "Настройки", Toast.LENGTH_SHORT).show()
        }
    }
}