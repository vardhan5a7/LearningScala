package com.Assignment1.learn

class AddCharFrantAndRear {
    def testingString(string: String): String = {
        if(string.length <= 1)
            string
        else
            string.charAt(string.length - 1) +: string :+ string.charAt(string.length - 1)
    }
}
