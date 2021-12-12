package com.scala.collection

object MapFlatMapFilterFor extends App {

  val list = List(1,2,3)

  println(list)
  println(list.head)
  println(list.tail)

  //Map
  println(list.map(_ + 1))
  println(list.map(_ + " is a number"))

  //filter
  println(list.filter(_ % 2 == 0))

  //flatmap
  val trav = (x: Int) => List(x , x + 1)
  println(list.flatMap(trav))
  var v = List(1,4,1,67,4,3,2,1)
  println(v.flatMap(n => list.map(v =>  + n + v)))
  println(v.flatMap(n => v.map(m => n + m)))

  val numbers = List(1, 2, 3, 4)
  val char = List('a', 'b', 'c', 'd')
  val color = List("red", "blue")

  val combination = numbers.flatMap(n => char.map(c => "" + c + n))
  println(combination)

  val combinationOfAll = numbers.flatMap(n => char.flatMap(c => color.map(co => "" + c + n + co)))
  val combinationOfAll1 = numbers.filter(_ % 2 == 0).flatMap(n => char.flatMap(c => color.map(co => "" + c + n + co)))
  println(combinationOfAll)

  //foreach
  println(numbers.foreach(println))

  //for-comprehensions
  val forcomprehensions = for {
    n <- numbers
    c <- char
    co <- color
  }yield "" + c + n + co
  println(forcomprehensions)

  val forcomprehensions1 = for {
    n <- numbers if n % 2 == 0
    c <- char
    co <- color
  }yield "" + c + n + co
  println(forcomprehensions)

  for{
    n <- numbers
  }println(n)
}
