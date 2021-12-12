package com.scala.oops

object Exceptions extends App{

  val str: String = null
  //println(str.length)

  //1. throwing exceptions
  //val exceptionHandle: String = throw new NullPointerException

  //2.how to catch exception
  def getInt(withException: Boolean): Int =
    if(withException)
      throw new RuntimeException("No integer value")
    else
      77

  val potentailFail = try{
    getInt(false)
  }
  catch {
    //case e : NullPointerException => println("caught a runtime exception")
    case e : NullPointerException => 43
  }
  finally {
    println("finally")
  }

  println(potentailFail)

  //3. how to define our own exception

//  class MyException extends Exception
//  val exceptions = new MyException
//  throw exceptions

  //OutOfMemoryException
  //val arr = Array.ofDim(Int.MaxValue)

  //StackOverflow
//  def infinite: Int = 1 + infinite
//  val noLimit  = infinite

  class OverflowException extends RuntimeException
  class UnderflowException extends RuntimeException
  class MathCalculateException extends RuntimeException("Divison of zero")

  object PocketCalculator {
    def add(x: Int, y: Int) = {
      val result = x + y
      if(x > 0 && y > 0 && result < 0) throw new OverflowException
      if(x < 0 && y < 0 && result > 0) throw  new UnderflowException
      else
        result
    }

    def substract(x: Int, y: Int) = {
      val result = x + y
      if(x > 0 && y < 0 && result < 0) throw new OverflowException
      if(x < 0 && y > 0 && result > 0) throw  new UnderflowException
      else
        result
    }

    def multiplay(x: Int, y: Int) = {
      val result = x + y
      if(x < 0 && y < 0 && result < 0) throw new OverflowException
      if(x > 0 && y < 0 && result > 0) throw  new UnderflowException
      if(x < 0 && y > 0 && result > 0) throw  new UnderflowException
      else
        result
    }

    def divide(x: Int, y: Int): Int =
    {
      println(y)
      if(y == 0) throw new MathCalculateException
      else
        x / y
    }

  }
  //println(PocketCalculator.add(Int.MaxValue, 10))
  println(PocketCalculator.divide(4,-1))

}
