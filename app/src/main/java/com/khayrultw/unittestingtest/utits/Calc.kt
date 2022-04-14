package com.khayrultw.unittestingtest.utits

class Calc(private val sum: Sum) {
    fun sum(a: Int, b: Int): Int {
        return sum.sum(a, b)
    }
}