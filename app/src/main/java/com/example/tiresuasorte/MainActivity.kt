package com.example.tiresuasorte

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import java.util.Random.*
import kotlinx.android.synthetic.main.activity_frases.*
import java.util.*
import kotlin.random.Random


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_frases)
        btnDescubra.setOnClickListener(View.OnClickListener {
            retornaFrases(btnDescubra)
        })

    }

    private fun retornaFrases(view: View?) {
        val frases = resources.getTextArray(R.array.frases)
        var random = Random.nextInt(0, frases.size - 1);
        tvFrase.text = frases[random]
    }
}
