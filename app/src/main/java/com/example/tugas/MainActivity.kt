package com.example.tugas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas.databinding.ActivityMainBinding

//membuat variable binding
private lateinit var binding: ActivityMainBinding
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //inisialisasi binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        //memanggil layout dengan menggunakan binding.root
        setContentView(binding.root)

        val getData = intent.getParcelableExtra<ModelLogin>("data")
        binding.txtUserName.text = getData?.username.toString()
        binding.txtPassword.text = getData?.password.toString()
        //Explicit Intent
        binding.btnIntentWidget.setOnClickListener {
            val intent = Intent(this,Widget::class.java)
            startActivity(intent)
        }
        binding.btnIntentExplicit.setOnClickListener {
            val intent = Intent(this,Implicitintent::class.java)
            startActivity(intent)
        }
    }
}