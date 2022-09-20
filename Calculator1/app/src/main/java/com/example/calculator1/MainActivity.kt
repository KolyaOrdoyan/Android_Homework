package com.example.calculator1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import net.objecthunter.exp4j.ExpressionBuilder
import java.lang.Exception

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnClickListener { setTextFields("0") }
        btn_1.setOnClickListener { setTextFields("1") }
        btn_2.setOnClickListener { setTextFields("2") }
        btn_3.setOnClickListener { setTextFields("3") }
        btn_4.setOnClickListener { setTextFields("4") }
        btn_5.setOnClickListener { setTextFields("5") }
        btn_6.setOnClickListener { setTextFields("6") }
        btn_7.setOnClickListener { setTextFields("7") }
        btn_8.setOnClickListener { setTextFields("8") }
        btn_9.setOnClickListener { setTextFields("9") }

        btn_minus.setOnClickListener { setTextFields("-") }
        btn_plus.setOnClickListener { setTextFields("+") }
        btn_div.setOnClickListener { setTextFields("÷") }
        btn_multiply.setOnClickListener { setTextFields("*") }
        btn_percent.setOnClickListener { setTextFields("%") }

        btn_C.setOnClickListener {
            btn_input.text = ""
            btn_result.text = ""
        }

        btn_back.setOnClickListener {
            val str = btn_input.text.toString()
            if (str.isNotEmpty())
                btn_input.text = str.substring(0, str.length - 1)

            btn_result.text = ""
        }

        btn_equal.setOnClickListener {
            try {
                val ex = ExpressionBuilder(btn_input.text.toString()).build()
                val result = ex.evaluate()

                val longRes = result.toLong()
                if (result == longRes.toDouble())
                    btn_result.text = longRes.toString()
                else
                    btn_result.text = result.toString()
            } catch (e: Exception) {
                Log.d("Error", "message: ${e.message}")
            }
        }
    }

    fun setTextFields(str: String) {
        if (btn_result.text != ""){
            btn_input.text = btn_result.text
            btn_result.text = ""
        }
        btn_input.append(str)
    }

}