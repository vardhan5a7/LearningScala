package com.scala.Basics

object callByValueAndCallByName extends App {

  def callByValue(x: Long): Unit = {
    println("call by value " + x)
    println("call by value " + x)
  }

  def callByName(x: => Long): Unit = {
    println("Call by name " + x)
    println("call by name " + x)
  }

  callByValue(System.nanoTime())
  callByName(System.nanoTime())
}
