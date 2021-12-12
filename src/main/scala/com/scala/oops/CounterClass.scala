package com.scala.oops

object CounterClass extends App {
    val counter = new Counter

    counter.inc.print
    counter.inc.inc.inc
    counter.inc.inc(3).print
}
//Counter class function
class Counter(val count :Int = 0) {
  def inc = {
    println("Incrementing")
    new Counter(count + 1)
  }

  def dec = {
    println("Dcrementing")
    new Counter(count - 1)
  }

  def inc(n : Int): Counter = {
    if(n  <= 0)
        this
    else
       inc.inc(n - 1)
  }

  def dec(n: Int): Counter ={
    if(n <= 0)
        this
    else
      dec.dec(n - 1)

  }

  def print = println(count)
}
