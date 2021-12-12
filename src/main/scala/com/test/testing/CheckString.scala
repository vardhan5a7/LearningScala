package com.test.testing

class CheckString {
    def printFirstTwoCharacters(str: String): String = {
        if(str.length <= 1)
           "not valid string"
        else
          str.substring(0,2) * 4
    }
}
