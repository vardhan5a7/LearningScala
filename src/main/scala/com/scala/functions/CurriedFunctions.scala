package com.scala.functions

object CurriedFunctions extends App {

  //curried functions
  val superAdder: Int => Int => Int  = (x: Int) => (y: Int) => x + y
  val add3 = superAdder(2)
  println(add3(3))
  println((superAdder(3)(4)))

  //function with multiple parameter list
  def curriedFunctions(c: String)(x: Double): String = c.format(x)

  val standardFormat: (Double => String) = curriedFunctions("%4.2f")
  val priceFormat: (Double => String) = curriedFunctions("%10.8f")

  println(standardFormat(Math.PI))
  println(standardFormat(Math.PI))


  def toCurry(f: (Int, Int) => Int): (Int => Int => Int) =
    x => y => f(x, y)

  def fromCurry(f: (Int => Int => Int)): (Int, Int) => Int  =
    (x,y) => f(x)(y)

  def compose(f: Int => Int, g: Int => Int): Int => Int =
    x => f(g(x))

  def andThan(f: Int => Int, g: Int => Int): Int => Int =
    x => g(f(x))

  //using generic
//  def compose[A,B,T](f: A => B, g: T => A): T => B =
//    x => f(g(x))
//
//  def andThan[A,B,C](f: A => B, g: B => C): A => C =
//    x => g(f(x))

  def superAdder12: (Int => Int => Int) = toCurry(_ + _)
  def add1 = superAdder12(4)
  println(add1(17))

  val simpleAdder = fromCurry(superAdder12)
  println(simpleAdder(4,17))

  val add2 = (x: Int) => x + 1
  val timeOf3 = (x: Int) => x * 3

  val composed = compose(add2, timeOf3)
  val orderd = andThan(add2,timeOf3)
  println(composed(4))
  println(orderd(4))


}
