package com.test.scala

import com.Assignment1.learn.AddCharFrantAndRear
import org.scalatest.funsuite.AnyFunSuite

class AddStringLastAndFrant extends  AnyFunSuite{
    val stringLastAndFrant = new AddCharFrantAndRear

    test(testName = "Check the given string "){
        assert(stringLastAndFrant.testingString("scala") == "ascalaa")
        assert(stringLastAndFrant.testingString("Test") == "tTestt")
        assert(stringLastAndFrant.testingString("t" )== "t")
    }

}
