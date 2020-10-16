package com.example.exercise6

import android.media.AudioManager
import android.media.SoundPool
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hell.*

class HellActivity : AppCompatActivity() {
    private var soundPool : SoundPool? = null
    private var soundId = 1
    private var pausesound = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hell)
        soundPool = SoundPool(6, AudioManager.STREAM_MUSIC, 0)
        soundPool!!.load(baseContext, R.raw.stp, 1)
        play.setOnClickListener {
            if (pausesound == 0){
                startSong()
            }
            else resumeSong()
        }
        pause.setOnClickListener {
            pauseSong()
        }
        stop.setOnClickListener {
            stopSong()
        }
    }
    fun startSong (){
        soundPool!!.play(soundId, 1F, 1F, 0, 0, 1F)
    }
    fun stopSong (){
        soundPool!!.stop(soundId)
    }
    fun pauseSong (){
        soundPool!!.pause(soundId)
        pausesound = 1
    }
    fun resumeSong(){
        soundPool!!.resume(soundId)
        pausesound = 0
    }
}