package com.scala.Basics

import java.util.Scanner
import scala.annotation.tailrec

object Demo extends App {
  @tailrec
  def multipleString(str: String, n: Int, acumulater: String): String =
    if (n <= 1)
      acumulater
    else
      multipleString(str, n - 1, acumulater + str)

  println(multipleString("hai", 5, ""))

  //muliple string

  def fistTwoString(str: String, n: Int): Unit =
    println(str.substring(0, 2) * n)

  fistTwoString("vardhan", 4)

  def factorial(n: Int): Int = {
    if (n <= 1)
      1
    else {
      n * factorial(n - 1)
    }
  }

  println(factorial(5))

  def isPrime(x: Int): Boolean = {
    @tailrec
    def isPrimeSub(t: Int, isPrime: Boolean): Boolean =
      if (!isPrime)
        false
      else if (t <= 1)
        true
      else isPrimeSub(t - 1, x % t != 0 && isPrime)

    isPrimeSub(x / 2, true)

  }

  println(isPrime(127))

  val i = 0
  //normal for loop
  for (i <- 0 to 10)
    print(i)
  println()
  //for loop using until
  for (i <- 0 until 10)
    print(i)
  println()

  //for loop using if conditions
  val kl: Int = 0
  for (kl <- 0 to 10 if (kl != 4) if (kl <= 7))
    print(kl)

  println()

  //print 1 to 10 using recursion
  def displayNumber(n: Int): Int =
    if (n <= 1)
      1
    else
      n + displayNumber(n - 1)

  println(displayNumber(5))

  //Declaration Array in scala
  val arr: Array[Int] = new Array[Int](10);
  val il = 0
  for (il <- 0 to arr.length - 1)
    arr(il) = 9
  println()
  for (il <- 0 to arr.length - 1)
    print(arr(0))
  val string = arr.mkString(" , ")
  println(string)

  val arr1 = new Array[String](3)
  println("Enter the value of ")
  var sc = new Scanner(System.in)
  arr1(0) = sc.nextLine()
  arr1(1) = readLine()
  var k = 0
  while (k < arr1.length) {
    print(arr1(k) + ",")
    k += 1
  }

  //fabonaci series
  println()

  def febaonaciSeries(n: Int): Int = {
    @tailrec
    def febonaciec(i: Int, last: Int, nextToLast: Int): Int =
      if (i >= n)
        last
      else
        febonaciec(i + 1, last + nextToLast, last)

    if (n <= 2)
      1
    else
      febonaciec(2, 1, 1)

  }

  println(febaonaciSeries(8))


}
