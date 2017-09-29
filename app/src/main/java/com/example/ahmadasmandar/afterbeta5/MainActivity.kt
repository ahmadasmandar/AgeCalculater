package com.example.ahmadasmandar.afterbeta5

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun calculateYourage(view: View)
    {
        val YearofBirth:Int=inputtext.text.toString().toInt()
        val ThisYear:Int=Calendar.getInstance().get(Calendar.YEAR)
        val Yourage:Int=ThisYear-YearofBirth
        Toast.makeText(this,"Your age is $Yourage",Toast.LENGTH_LONG).show()

    }
}
