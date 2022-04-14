package com.khayrultw.unittestingtest.utils

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.khayrultw.unittestingtest.MainCoroutineRule
import com.khayrultw.unittestingtest.utits.Calc
import com.khayrultw.unittestingtest.utits.Sum
import com.khayrultw.unittestingtest.utits.SumImpl
import junit.framework.Assert.assertEquals
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mockito
import kotlin.time.ExperimentalTime

class CalcTest {

    @ExperimentalCoroutinesApi
    @Rule
    @JvmField
    val mainCoroutineRule = MainCoroutineRule()

    @Rule
    @JvmField
    val rule = InstantTaskExecutorRule()

    private val sum: Sum = Mockito.mock(Sum::class.java)
    lateinit var calc: Calc

    @Before
    fun setup() {
        calc = Calc(sum)
    }

    @ExperimentalTime
    @Test
    fun sum() {
        Mockito.`when`(calc.sum(1, 2)).thenReturn(3)
        assertEquals(calc.sum(1, 2), 3)
    }
}