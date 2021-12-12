package com.scala.functions

import com.sun.org.apache.xpath.internal.functions.FunctionDef1Arg

object WhatsFunction extends App {

  //use function as first class elements
  //Function types in scala Function1 to Function20
  val doubler = new MyFunction[Int, Int] {
    override def apply(element: Int): Int = element * 2
  }
  println(doubler(2))

  val stringToIntConvertor = new Function1[String, Int]  {
    override def apply(string: String): Int = string.toInt
  }
  println(stringToIntConvertor("3")+ 4)

  val adder = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }
  //otherwies
  val adder1: Function2[Int, Int, Int] = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }
  //Syntatic suger Funtion2[A, B ,RType] equals to (Int, Int) => Int
  val adder2: (Int, Int) => Int = new Function2[Int, Int, Int] {
    override def apply(a: Int, b: Int): Int = a + b
  }
  //ALL SCALA FUNCTIONS ARE OBJECTS

  def concatTwoStrings: (String, String) => String = new Function2[String, String, String] {
    override def apply(s1: String, s2: String): String = s1 + s2
  }
  println(concatTwoStrings("Hello"," Scala"))

  val superAdder: Function1[Int, Function1[Int, Int]] = new Function1[Int, Function1[Int, Int]] {
    override def apply(x: Int): Function1[Int, Int] = new Function[Int, Int] {
      override def apply(y: Int): Int = x + y
    }
  }
  val adder3 = superAdder(3)
  println(adder3(4))
  println(superAdder(3)(4)) // Curried function
}

trait MyFunction[A, B] {
  def apply(element: A): B
}