package io.github.tuguzd.navigationdrawer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.tuguzd.navigationdrawer.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
