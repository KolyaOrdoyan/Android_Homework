package com.example.calculiator2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import net.objecthunter.exp4j.ExpressionBuilder


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Button0.setOnClickListener { setTextFields("0") }
        Button1.setOnClickListener { setTextFields("1") }
        Button2.setOnClickListener { setTextFields("2") }
        Button3.setOnClickListener { setTextFields("3") }
        Button4.setOnClickListener { setTextFields("4") }
        Button5.setOnClickListener { setTextFields("5") }
        Button6.setOnClickListener { setTextFields("6") }
        Button7.setOnClickListener { setTextFields("7") }
        Button8.setOnClickListener { setTextFields("8") }
        Button9.setOnClickListener { setTextFields("9") }

        Button_minus.setOnClickListener { setTextFields("-") }
        Button_plus.setOnClickListener { setTextFields("+") }
        Button_div.setOnClickListener { setTextFields("/") }
        Button_multiply.setOnClickListener { setTextFields("*") }
        Button_point.setOnClickListener { setTextFields(".") }
        Button_percent.setOnClickListener { setTextFields("%") }

        Button_Clear.setOnClickListener {
            Button_input.text = ""
            Button_result.text = ""
        }

        Button_back.setOnClickListener {
            val str = Button_input.text.toString()
            if (str.isNotEmpty())
                Button_input.text = str.substring(0, str.length - 1)

            Button_result.text = ""
        }

        Button_equal.setOnClickListener {
            try {
                val ex = ExpressionBuilder(Button_input.text.toString()).build()
                val result = ex.evaluate()

                val longRes = result.toLong()
                if (result == longRes.toDouble())
                    Button_result.text = longRes.toString()
                else
                    Button_result.text = result.toString()
            } catch (e: Exception) {
                Log.d("Error", "message: ${e.message}")
            }
        }
    }


    private fun setTextFields(s: String) {
        if (Button_result.text != "") {
            Button_input.text = Button_result.text
            Button_result.text = ""
        } else {
            Button_input.append(s)
        }
    }
}