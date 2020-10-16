package com.example.exercise6

import android.app.Application
import android.content.Intent
import android.graphics.Color
import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.io.FileInputStream
import java.util.*

class MainActivity : AppCompatActivity() {
    var soundPool: SoundPool ?= null
    var soundId = 1
    var ooooh = R.raw.ohhhhh
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        soundPool = SoundPool(6,AudioManager.STREAM_MUSIC,0)
        soundPool!!.load(baseContext, ooooh,1)
        var stringone = ""
        var stringtwo = ""
        var stringthree = (0).toDouble()
        var mul = 0
        var div = 0
        var min = 0
        var plu = 0
        one.setOnClickListener {
            stringone += "1"
            text1.setText(stringone)
        }
        two.setOnClickListener {
            stringone += "2"
            text1.setText(stringone)
        }
        three.setOnClickListener {
            stringone += "3"
            text1.setText(stringone)
        }
        four.setOnClickListener {
            stringone += "4"
            text1.setText(stringone)
        }
        five.setOnClickListener {
            stringone += "5"
            text1.setText(stringone)
        }
        six.setOnClickListener {
            stringone += "6"
            text1.setText(stringone)
        }
        seven.setOnClickListener {
            stringone += "7"
            text1.setText(stringone)
        }
        eight.setOnClickListener {
            stringone += "8"
            text1.setText(stringone)
        }
        nine.setOnClickListener {
            stringone += "9"
            text1.setText(stringone)
        }

        zero.setOnClickListener {
            if (stringone != "") {
                stringone += "0"
                text1.setText(stringone)
            }
        }

        multiply.setOnClickListener {
            if (stringtwo == "") {
                if (stringone == "") {
                    Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show()
                } else {
                    stringtwo = stringone
                    text2.setText(stringtwo)
                    stringtwo.toDouble()
                    stringone = ""
                    text1.setText(stringone)
                    min = 0
                    mul = 1
                    plu = 0
                    div = 0
                    multiply.setBackgroundColor(Color.WHITE)
                    divide.setBackgroundColor(Color.BLACK)
                    minus.setBackgroundColor(Color.BLACK)
                    plus.setBackgroundColor(Color.BLACK)
                }
            }
        }
        divide.setOnClickListener {
            if (stringtwo == "") {
                if (stringone == "") {
                    Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show()
                } else {
                    stringtwo = stringone
                    text2.setText(stringtwo)
                    stringtwo.toDouble()
                    stringone = ""
                    text1.setText(stringone)
                    min = 0
                    mul = 0
                    plu = 0
                    div = 1
                    multiply.setBackgroundColor(Color.BLACK)
                    divide.setBackgroundColor(Color.WHITE)
                    minus.setBackgroundColor(Color.BLACK)
                    plus.setBackgroundColor(Color.BLACK)
                    divideb.visibility = View.GONE
                    dividew.visibility = View.VISIBLE
                }
            }
        }
        plus.setOnClickListener {
            if (stringtwo == "")
            if (stringone == "") {
                Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show()
            } else {
                stringtwo = stringone
                text2.setText(stringtwo)
                stringtwo.toDouble()
                stringone = ""
                text1.setText(stringone)
                min = 0
                mul = 0
                plu = 1
                div = 0
                multiply.setBackgroundColor(Color.BLACK)
                divide.setBackgroundColor(Color.BLACK)
                minus.setBackgroundColor(Color.BLACK)
                plus.setBackgroundColor(Color.WHITE)
            }
        }
        minus.setOnClickListener {
            if (stringtwo == "") {
                if (stringone == "") {
                    Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show()
                } else {
                    stringtwo = stringone
                    text2.setText(stringtwo)
                    stringtwo.toDouble()
                    stringone = ""
                    text1.setText(stringone)
                    min = 1
                    mul = 0
                    plu = 0
                    div = 0
                    multiply.setBackgroundColor(Color.BLACK)
                    divide.setBackgroundColor(Color.BLACK)
                    minus.setBackgroundColor(Color.WHITE)
                    plus.setBackgroundColor(Color.BLACK)
                }
            }
        }
        equals.setOnClickListener {
            if (stringone == ""||stringtwo == ""|| text1.toString() == ""||text2.toString() == "") {
                Toast.makeText(this, "Введите число", Toast.LENGTH_SHORT).show()
            } else {
                lookatthis.visibility = View.VISIBLE
                if (min == 1) {
                    var a = stringone.toDouble()
                    var b = stringtwo.toDouble()
                    stringthree = b - a
                    text3.setText(stringthree.toString())
                }
                if (mul == 1) {
                    var a = stringone.toDouble()
                    var b = stringtwo.toDouble()
                    stringthree = b * a
                    text3.setText(stringthree.toString())
                }
                if (div == 1) {
                    var a = stringone.toDouble()
                    var b = stringtwo.toDouble()
                    stringthree = b / a
                    text3.setText(stringthree.toString())
                }
                if (plu == 1) {
                    var a = stringone.toDouble()
                    var b = stringtwo.toDouble()
                    stringthree = b + a
                    text3.setText(stringthree.toString())
                }
                if (stringthree.toString().contains("69")){
                    playOhhhh()
                    Toast.makeText(this, "LMAO", Toast.LENGTH_SHORT).show()
                }
                if (stringthree.toString().contains("777")){
                    toTututru()
                }
                if (stringthree.toString().contains("666")){
                    toHell()
                }
                if (text3.toString()!=("")){
                    egls1.visibility = View.GONE
                    egls2.visibility = View.VISIBLE

                }
            }
        }
        egls2.setOnClickListener {
            stringone = stringthree.toString()
            text1.setText(stringone)
            stringtwo = ""
            text2.setText("")
            text3.setText("")
            multiply.setBackgroundColor(Color.BLACK)
            divide.setBackgroundColor(Color.BLACK)
            minus.setBackgroundColor(Color.BLACK)
            plus.setBackgroundColor(Color.BLACK)
            lookatthis.visibility = View.GONE
            divideb.visibility = View.VISIBLE
            dividew.visibility = View.GONE
            egls2.visibility = View.GONE
            egls1.visibility = View.VISIBLE
        }


        clear.setOnClickListener {
            egls1.visibility = View.VISIBLE
            egls2.visibility = View.GONE
            lookatthis.visibility = View.GONE
            divideb.visibility = View.VISIBLE
            dividew.visibility = View.GONE
            multiply.setBackgroundColor(Color.BLACK)
            divide.setBackgroundColor(Color.BLACK)
            minus.setBackgroundColor(Color.BLACK)
            plus.setBackgroundColor(Color.BLACK)
            stringone = ""
            stringtwo = ""
            stringthree = (0).toDouble()
            text1.setText("")
            text2.setText("")
            text3.setText("")
        }
    }
    fun playOhhhh(){
        soundPool?.play(soundId,1F,1F,0,0,1F)
    }
    fun toHell(){
        startActivity(Intent(this,HellActivity::class.java))
    }
    fun toTututru(){
        startActivity(Intent(this, TuturuActivity::class.java))
    }

}







