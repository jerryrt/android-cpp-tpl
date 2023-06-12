package com.example.cpp_android_tpl

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.cpp_android_tpl.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Example of a call to a native method
        binding.sampleText.text = stringFromJNI() + ":" + intFromJNI()
    }

    /**
     * A native method that is implemented by the 'cpp_android_tpl' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    external fun intFromJNI(): Int

    external fun helloCFromJNI(): Int

    companion object {
        // Used to load the 'cpp_android_tpl' library on application startup.
        init {
            System.loadLibrary("cpp_android_tpl")
        }
    }

    override fun onResume() {
        super.onResume()

        helloCFromJNI()
    }
}