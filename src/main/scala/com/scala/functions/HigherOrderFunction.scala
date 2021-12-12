package com.scala.functions

object HigherOrderFunction extends  App {

  def nTimes(f: Int => Int, n: Int, x: Int): Int = {
    if(n <= 0) x
    else nTimes(f,n - 1, f(x))
  }
  val plusOne: Int => Int = (x: Int) => x + 1
  println(nTimes(plusOne,10,1))

  def nTimesBetter(f: Int => Int, n: Int): (Int) => Int =
    if(n <= 0) (x:Int) => x
    else (x: Int) => nTimesBetter(f,n-1) (f(x))
  //here we use plusOne function
  val plusOneBetter = nTimesBetter(plusOne, 10)
  println(plusOneBetter(1))
}
