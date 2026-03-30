package com.example.imad5112_a1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }


        //Declaration

        val etTimeOfDay = findViewById<EditText>(R.id.etTimeOfDay)
        val tvResult = findViewById<TextView>(R.id.tvResult)
        val btnReset = findViewById<Button>(R.id.btnReset)
        val btnSuggest = findViewById<Button>(R.id.btnSuggest)

        //Reset Button
        //I used AI to get an idea on how to implement this code in particular

        btnReset.setOnClickListener {
            etTimeOfDay.text.clear()
            tvResult.text = ""
        }

        //Suggestions

        btnSuggest.setOnClickListener {


            val time = etTimeOfDay.text.toString()

            if (time == "Morning") {
                tvResult.text = " Send a 'Good Morning' text to a family member."
            } else {

                if (time == "Mid-morning") {
                    tvResult.text = " Reach out to a colleague with a quick 'Thank You'."
                } else {

                    if (time == "Afternoon") {
                        tvResult.text = "Share a funny meme or interesting link with a friend."
                    } else {

                        if (time == "Afternoon snack time") {
                            tvResult.text = " Send a quick 'thinking of you' message."
                        } else {

                            if (time == "Dinner") {
                                tvResult.text =
                                    " Call a friend or relative for a 5-minute catch-up."
                            } else {

                                if (time == "After Dinner" || time == "Night") {
                                    tvResult.text = "Leave a thoughtful comment on a friend's post"
                                } else {
                                    //Error Handling
                                    tvResult.text = "Please enter a valid time(Choose either Morning, Afternoon or Night)"
                                }
                            }
                        }
                    }
                }
            }
        }
        }
    }
