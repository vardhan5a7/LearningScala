package com.scala.functions

object AnonymousFunctions extends  App {

  //anonymous function or (LAMBDA)
  val adder  = (x: Int) => x + 1
  println(adder(2))
  //similar to this
  val adder1: (Int) => Int = (x: Int) => x + 4
  println(adder1(3))
  //  (or)
  val adder2: Int => Int = x => x + 1
  println(adder2(3))
  //more example
  val adder3: (Int, Int) => Int = (x: Int, y: Int) => x  + y
  println(adder3(3,4))

  //No parameters
  val adder4 = () => 4
  println(adder4) //function itselt
  println(adder4()) //call

  //More syntactic sugar
  val niceIncrement: Int => Int = _ + 1 // equivalent to x: Int => x + 1
  val niceIncremnet1: (Int, Int) => Int = _ + _ // equivalent to X: Int, y: Int => x + y

}
