package com.test.scala

import com.test.testing.CheckString
import org.scalatest.funsuite.AnyFunSuite

class TestString extends  AnyFunSuite{
    val testString = new CheckString

    test(testName = "check the valid string are not "){
        assert(testString.printFirstTwoCharacters("India") == "InInInIn")
        assert(testString.printFirstTwoCharacters("scala") == "scscscsc")
        assert(testString.printFirstTwoCharacters("s") == "not valid string")
        assert(testString.printFirstTwoCharacters("va") == "vavavava")
    }
}
