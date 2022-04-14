package com.khayrultw.unittestingtest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.khayrultw.unittestingtest.utits.Calc
import com.khayrultw.unittestingtest.utits.SumImpl

class MainActivity : AppCompatActivity() {
    private val sum = SumImpl()
    private val calc = Calc(sum)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print(calc.sum(1, 2))
    }
}