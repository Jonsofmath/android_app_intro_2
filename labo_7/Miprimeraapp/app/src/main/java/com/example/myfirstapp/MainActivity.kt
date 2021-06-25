package com.example.myfirstapp

/* Import libraries */
import android.media.MediaPlayer
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.ImageButton
import java.util.*
import kotlin.concurrent.schedule

/* Main class definition */
class MainActivity : AppCompatActivity(){
    /* Media player variables */
    private var mMediaPlayer0: MediaPlayer? = null
    private var mMediaPlayer1: MediaPlayer? = null
    private var mMediaPlayer2: MediaPlayer? = null
    private var mMediaPlayer3: MediaPlayer? = null
    private var mMediaPlayer4: MediaPlayer? = null
    private var mMediaPlayer5: MediaPlayer? = null
    /* Image button variables */
    private lateinit var button0 : ImageButton
    private lateinit var button1 : ImageButton
    private lateinit var button2 : ImageButton
    private lateinit var button3 : ImageButton
    private lateinit var button4 : ImageButton
    private lateinit var button5 : ImageButton
    /* Other private variables */
    private var buttonPressed = 0   // 0 if imageButton0 pressed, 1 if imageButton1 pressed, etc
    private val num = arrayOf(0, 0, 0, 0)   // stores the number of the button that it's pressed
                                            // e.g. num[1] = 2 means that at second iteration,
                                            // button three was pressed
    private var counter = 0 // iterator of num array
    private var flag = 0    // function activation flag used in playSound functions

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /* Media player functions associated to each of six buttons
    *  The functions reproduces an audio when button is pressed
    *  and change it's color. */

    fun playSound0(view: View) {
        button0 = findViewById(R.id.imageButton0)

        if (mMediaPlayer0 == null) {
            mMediaPlayer0 = MediaPlayer.create(this, R.raw.dog)
            mMediaPlayer0!!.start()

            button0.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button0.setBackgroundResource(R.color.default0)
            }, 5000)
        } else
            mMediaPlayer0!!.start()
            button0.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button0.setBackgroundResource(R.color.default0)
            }, 5000)
        buttonPressed = 0   // stores the info of the button pressed
        if(flag == 1) {
            compare(view)
        }
    }

    fun playSound1(view: View) {
        button1 = findViewById(R.id.imageButton1)
        if (mMediaPlayer1 == null) {
            mMediaPlayer1 = MediaPlayer.create(this, R.raw.game)
            mMediaPlayer1!!.start()
            button1.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button1.setBackgroundResource(R.color.default1)
            }, 5000)

        } else
            mMediaPlayer1!!.start()
            button1.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button1.setBackgroundResource(R.color.default1)
            }, 5000)
        buttonPressed = 1   // stores the info of the button pressed
        if(flag == 1) {
            compare(view)
        }
    }

    fun playSound2(view: View) {
        button2 = findViewById(R.id.imageButton2)
        if (mMediaPlayer2 == null) {
            mMediaPlayer2 = MediaPlayer.create(this, R.raw.geese)
            mMediaPlayer2!!.start()
            button2.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button2.setBackgroundResource(R.color.default2)
            }, 5000)

        } else
            mMediaPlayer2!!.start()
            button2.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button2.setBackgroundResource(R.color.default2)
            }, 5000)
        buttonPressed = 2   // stores the info of the button pressed
        if(flag == 1) {
            compare(view)
        }
    }

    fun playSound3(view: View) {
        button3 = findViewById(R.id.imageButton3)
        if (mMediaPlayer3 == null) {
            mMediaPlayer3 = MediaPlayer.create(this, R.raw.horn)
            mMediaPlayer3!!.start()
            button3.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button3.setBackgroundResource(R.color.default3)
            }, 5000)

        } else
            mMediaPlayer3!!.start()
            button3.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button3.setBackgroundResource(R.color.default3)
            }, 5000)
        buttonPressed = 3   // stores the info of the button pressed
        if(flag == 1) {
            compare(view)
        }
    }

    fun playSound4(view: View) {
        button4 = findViewById(R.id.imageButton4)
        if (mMediaPlayer4 == null) {
            mMediaPlayer4 = MediaPlayer.create(this, R.raw.rocket)
            mMediaPlayer4!!.start()
            button4.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button4.setBackgroundResource(R.color.default4)
            }, 5000)

        } else
            mMediaPlayer4!!.start()
            button4.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button4.setBackgroundResource(R.color.default4)
            }, 5000)
        buttonPressed = 4   // stores the info of the button pressed
        if(flag == 1) {
            compare(view)
        }
    }

    fun playSound5(view: View) {
        button5 = findViewById(R.id.imageButton5)
        if (mMediaPlayer5 == null) {
            mMediaPlayer5 = MediaPlayer.create(this, R.raw.transition)
            mMediaPlayer5!!.start()
            button5.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button5.setBackgroundResource(R.color.default5)
            }, 5000)

        } else
            mMediaPlayer5!!.start()
            button5.setBackgroundResource(R.color.green)
            val handler = Handler(Looper.getMainLooper())
            handler.postDelayed({
                button5.setBackgroundResource(R.color.default5)
            }, 5000)
        buttonPressed = 5   // stores the info of the button pressed
        if(flag == 1) {
            compare(view)
        }
    }

    /* Function that disable all of the six media player buttons */
    private fun deactivate(view: View){
        button0 = findViewById(R.id.imageButton0)
        button1 = findViewById(R.id.imageButton1)
        button2 = findViewById(R.id.imageButton2)
        button3 = findViewById(R.id.imageButton3)
        button4 = findViewById(R.id.imageButton4)
        button5 = findViewById(R.id.imageButton5)

        button0.isEnabled = false
        button0.isClickable = false
        button1.isEnabled = false
        button1.isClickable = false
        button2.isEnabled = false
        button2.isClickable = false
        button3.isEnabled = false
        button3.isClickable = false
        button4.isEnabled = false
        button5.isClickable = false
        button5.isEnabled = false
        button5.isClickable = false

    }

    /* Function that enable all of the six media player buttons */
    private fun activate(view: View){
        button0 = findViewById(R.id.imageButton0)
        button1 = findViewById(R.id.imageButton1)
        button2 = findViewById(R.id.imageButton2)
        button3 = findViewById(R.id.imageButton3)
        button4 = findViewById(R.id.imageButton4)
        button5 = findViewById(R.id.imageButton5)

        button0.isEnabled = true
        button0.isClickable = true
        button1.isEnabled = true
        button1.isClickable = true
        button2.isEnabled = true
        button2.isClickable = true
        button3.isEnabled = true
        button3.isClickable = true
        button4.isEnabled = true
        button5.isClickable = true
        button5.isEnabled = true
        button5.isClickable = true

    }

    /* Function associated to Start button
    *  Plays four random buttons and stores the info of which button was pressed on num array
    *  e.g.: num = (2, 1, 0, 5) means that:
    *           button three were first random pressed
    *           button two were second random pressed
    *           button one were third random pressed
    *           button six were fourth random  */

    fun randomPlay(view: View){
        deactivate(view)    // deactivate functions while random play
        var delay: Long = 1000
        for (i in 0..3) {
            Timer("SettingUp", false).schedule(delay) {
                // choose random button.
                val random = (0..5).random()
                if (random == 0) {
                    playSound0(view)
                    num.set(i, 0)
                } else if (random == 1) {
                    playSound1(view)
                    num.set(i, 1)
                } else if (random == 2) {
                    playSound2(view)
                    num.set(i, 2)
                } else if (random == 3) {
                    playSound3(view)
                    num.set(i, 3)
                } else if (random == 4) {
                    playSound4(view)
                    num.set(i, 4)
                } else {
                    playSound5(view)
                    num.set(i, 5)
                }
            }
            delay = delay + 6000
        }
        /* After a delay since random play, buttons get reactivated and flag sets to one, meaning
        *  that compare function in playSound functions will work if they are pressed */
        Timer("SettingUp", false).schedule(21000) {
            activate(view)
            flag = 1
        }
    }

    /* Function that compares num array with the info of the button pressed
    *  After a button is pressed we have the info of who was pressed in buttonPressed variable,
    * then, if flag is one, compare function will work and will take one num array entry, specified
    * by counter variable and compare it's value with buttonPressed value to determine if they are
    *  equal or different */

    private fun compare(view: View){
        val mySnackbar = Snackbar.make(view, "Va por buen camino.", 4000)
        val mySnackbar0 = Snackbar.make(view, "Falló la secuencia. Por favor, repetir.", 4000)
        val mySnackbar1 = Snackbar.make(view, "¡ÉXITOOO!", 4000)

        if(num[counter] == buttonPressed && counter == 3){
            /* Sequence was succesfully repeated :) */
            mySnackbar1.show()  // show success message to user.
            counter = 0
            flag = 0
            /* After a delay, random play occur again */
            /*
            Timer("SettingUp", false).schedule(7000) {
                randomPlay(view)
                counter = 0
                flag = 0
            }*/
        } else if (num[counter] == buttonPressed && counter != 3){
            /* Sequence in progress */
            mySnackbar.show()   // show progress message
            counter = counter + 1   // when other button is pressed, we'll need to compare the next
                                    // num array entry.
        } else {
            /* Sequence failed :( */
            mySnackbar0.show()
            counter = 0
            flag = 0
            /*
            Timer("SettingUp", false).schedule(7000) {
                randomPlay(view)
                counter = 0
                flag = 0
            }*/
        }
    }
}
