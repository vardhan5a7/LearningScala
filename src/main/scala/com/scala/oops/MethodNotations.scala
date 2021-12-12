package com.scala.oops

import java.security.spec.PKCS8EncodedKeySpec

object MethodNotations extends App{

    class Person(val name: String, favoriteMovie: String)
    {
        def likes(movie: String): Boolean = movie == favoriteMovie

        def hangOutWith(person: Person): String = s"${this.name} hangout with ${person.name}"
        def +(person: Person): String = s"${this.name} hangout with ${person.name}"
        def unary_! : String = s"$name what the hell"
        def isalive : Boolean = true
        def applay() : String = s"hai my name  $name my favorite movie is $favoriteMovie "
    }

    val mary = new Person("Mary", "Ironman")

    println(mary.likes("Ironman"))

    //infix notation = operator notation (Syntactic sugar)
    println(mary likes "Ironman") // equivalent

    val tom = new Person("Tom", "Thor")
    // Both are similar
    println(mary.hangOutWith(tom))
    println(mary hangOutWith tom)

    //Operator in scala
    println("=========Operators in Scala==========")
    //Both are similar
    println(mary + tom)
    println(mary.+(tom))

    //All Operators in scala are methods
    println(1 + 2)
    println(1.+(2))

    //Prefix Notation
    val x = -1
    val y = 1.unary_-
    //unary - prefix only work with - + ~ !
    println(!mary)
    println(mary.unary_!)

    //postfix notation
    println(mary.isalive)
    println(mary isalive)

    println(mary.applay())
    println(mary)


}


