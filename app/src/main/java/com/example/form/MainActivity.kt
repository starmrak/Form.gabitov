package com.example.form
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.example.form.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        findViewById<RadioButton>(R.id.radioButton8).setOnCheckedChangeListener { buttonView, isChecked ->
            binding.textView22.visibility=View.VISIBLE
            binding.textView20.visibility=View.VISIBLE
        }
        findViewById<RadioButton>(R.id.radioButton9).setOnCheckedChangeListener { buttonView, isChecked ->
            binding.textView22.visibility=View.INVISIBLE
            binding.textView20.visibility=View.INVISIBLE
        }
    }
}