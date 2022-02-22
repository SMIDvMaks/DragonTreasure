package com.dnroag.terreuas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.dnroag.terreuas.Tooliks.Kindere

class ZAdpGANEN : AppCompatActivity() {
    var stopsek = 0
    var hand = Handler()
    lateinit var boxiimg1: ImageView
    lateinit var boxiimg2: ImageView
    lateinit var boxiimg3: ImageView
    lateinit var hiis: ImageView
    lateinit var lucky: TextView
    lateinit var resik: TextView
    lateinit var Ar_boxik: MutableList<Int>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zadp_ganen)
        window.addFlags(1024)
        var cici = 10
        val boxik: ImageView = findViewById(R.id.btn_box)
        boxiimg1 = findViewById(R.id.box1)
        boxiimg2 = findViewById(R.id.box2)
        boxiimg3 = findViewById(R.id.box3)
        lucky = findViewById(R.id.schetText)
        resik = findViewById(R.id.result)
        hiis = findViewById(R.id.heig)
        Ar_boxik = mutableListOf(
            R.drawable.a1,
            R.drawable.a2,
            R.drawable.a3,
            R.drawable.a4,
            R.drawable.a5,
            R.drawable.a7
        )
        boxik.setOnClickListener {
            if (cici == 0) {
                recreate()
            }
            cici--
            resik.text = "$cici"
            BoxRotatte()
            if (stopsek >= 1500){
                hiis.visibility = View.VISIBLE
                hand.postDelayed({
                    recreate()
                },2000)
            }
        }
    }
    fun BoxRotatte() {
        hand.post(object : Runnable {
            var popint = 0

            @SuppressLint("SetTextI18n")
            override fun run() {
                popint++
                if (popint != 45) {
                    hand.postDelayed(this::run, 15)
                    Ar_boxik.shuffle()
                    boxiimg1.setImageResource(Ar_boxik[0])
                    boxiimg1.tag = Ar_boxik[0]
                    Ar_boxik.shuffle()
                    boxiimg2.setImageResource(Ar_boxik[0])
                    boxiimg2.tag = Ar_boxik[0]
                    Ar_boxik.shuffle()
                    boxiimg3.setImageResource(Ar_boxik[0])
                    boxiimg3.tag = Ar_boxik[0]
                } else if (boxiimg1.tag.equals(boxiimg2.tag) && boxiimg1.tag.equals(boxiimg3.tag) && boxiimg2.tag.equals(boxiimg3.tag)) {
                    stopsek += 2000
                    Toast.makeText(this@ZAdpGANEN, Kindere("V293LCB5b3Ugd29u"), Toast.LENGTH_SHORT).show()
                    lucky.text = "Your Luck: $stopsek"

                } else {
                    if (boxiimg1.tag != (boxiimg2.tag) && boxiimg2.tag != (boxiimg3.tag) && boxiimg1.tag != boxiimg3.tag) {
                        stopsek -=500
                        Toast.makeText(
                            this@ZAdpGANEN,
                            Kindere("T2hoLCB5b3UgbG9zdCgoLHRyeSBsdWNreSBhZ2Fpbg=="),
                            Toast.LENGTH_SHORT
                        ).show()
                        lucky.text = "Your Luck: $stopsek"
                    } else if (boxiimg1.tag.equals(boxiimg2.tag) && boxiimg1.tag != (boxiimg3.tag)) {
                        stopsek +=200
                        Toast.makeText(this@ZAdpGANEN, "Ohh, almost,try again ", Toast.LENGTH_SHORT)
                            .show()
                        lucky.text = "Your Luck: $stopsek"
                    } else {
                        if (boxiimg1.tag != (boxiimg2.tag) && boxiimg1.tag.equals(boxiimg3.tag)) {
                            stopsek +=200
                            Toast.makeText(
                                this@ZAdpGANEN,
                                "Ohh, near,try again ",
                                Toast.LENGTH_SHORT
                            ).show()
                            lucky.text = "Your Luck: $stopsek"
                        }else if (boxiimg2.tag != (boxiimg1.tag) && boxiimg2.tag.equals(boxiimg3.tag)){
                            stopsek +=200
                            Toast.makeText(
                                this@ZAdpGANEN,
                                "Ohh, near,try again ",
                                Toast.LENGTH_SHORT
                            ).show()
                            lucky.text = "Your Luck: $stopsek"
                        }else{
                            if (boxiimg2.tag.equals(boxiimg1.tag) && boxiimg2.tag != (boxiimg3.tag)){
                                stopsek +=200
                                Toast.makeText(
                                    this@ZAdpGANEN,
                                    "Ohh, almost,try again ",
                                    Toast.LENGTH_SHORT
                                ).show()
                                lucky.text = "Your Luck: $stopsek"
                            }else if (boxiimg3.tag.equals(boxiimg1.tag) && boxiimg2.tag != (boxiimg3.tag)){
                                stopsek +=200
                                Toast.makeText(
                                    this@ZAdpGANEN,
                                    "Ohh, near,try again ",
                                    Toast.LENGTH_SHORT
                                ).show()
                                lucky.text = "Your Luck: $stopsek"
                            }else {
                                if (boxiimg3.tag.equals(boxiimg2.tag) && boxiimg3.tag != (boxiimg1.tag)){
                                    stopsek +=200
                                    Toast.makeText(
                                        this@ZAdpGANEN,
                                        "Ohh, almost,try again ",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                    lucky.text = "Your Luck: $stopsek"
                                }
                            }
                        }
                    }
                }
            }
        })
    }
}