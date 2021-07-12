package com.gurpreet.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun bunumber(view: View) {
        if (operationclicked==true){
            showtext.setText("")
        }
        operationclicked=false
        val buselect = view as Button
        var buselectvalue: String = showtext.text.toString()
        when (buselect.id) {
            bu0.id -> {
                buselectvalue += "0"
            }
            bu1.id -> {
                buselectvalue += "1"
            }
            bu2.id -> {
                buselectvalue += "2"
            }
            bu3.id -> {
                buselectvalue += "3"
            }
            bu4.id -> {
                buselectvalue += "4"
            }
            bu5.id -> {
                buselectvalue += "5"
            }
            bu6.id -> {
                buselectvalue += "6"
            }
            bu7.id -> {
                buselectvalue += "7"
            }
            bu8.id -> {
                buselectvalue += "8"
            }
            bu9.id -> {
                buselectvalue += "9"
            }
            budot.id -> {
                buselectvalue += "."
                budot.isEnabled = false
            }
            buplusminus.id -> {
                buselectvalue = "-" + buselectvalue
                buplusminus.isEnabled = false
            }
        }
        showtext.setText(buselectvalue)
    }
var operationclicked=true
var op="*"
var oldnumber=""
    fun buoperation(view: View) {
        val buselect = view as Button

        when (buselect.id) {

            bumul.id -> {
                op = "*"
            }
            budiv.id -> {
                op = "/"
            }
            buplus.id -> {
                op = "+"
            }
            buminus.id -> {
                op = "-"
            }

        }
        oldnumber=showtext.text.toString()
        operationclicked=true
    }

    fun buequaloperation(view: View){
        var finalnumber:Double?=null
        var newnumber=showtext.text.toString()
        when (op) {

               "*"-> {
                   finalnumber = oldnumber.toDouble() * newnumber.toDouble()
               }
               "+"-> {
                   finalnumber = oldnumber.toDouble() + newnumber.toDouble()
               }
               "-"-> {
                   finalnumber = oldnumber.toDouble() - newnumber.toDouble()
               }
               "/"-> {
                   finalnumber = oldnumber.toDouble() / newnumber.toDouble()
               }
        }
     showtext.setText(finalnumber.toString())
     operationclicked=true
    }
    fun buPercent(view:View){
        val number:Double=showtext.text.toString().toDouble()/100
        showtext.setText(number.toString())
        operationclicked=true
    }
    fun buClean(view:View){
        showtext.setText("0")
        operationclicked=true
    }
}