package com.example.exercise6

import android.media.AudioManager
import android.media.SoundPool
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_tuturu.*


class TuturuActivity : AppCompatActivity() {
    private var soundPool: SoundPool? = null
    private val soundId = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tuturu)
        playSound()
        soundPool = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool!!.load(baseContext, R.raw.tuturu, 1)
        tuturu.setOnClickListener {
            playSound()
        }
    }


    fun playSound() {
        soundPool?.play(soundId, 1F, 1F, 0, 0, 1F)
        Toast.makeText(this, "Tuturu", Toast.LENGTH_SHORT).show()
    }
}
