package com.scala.oops

abstract class MyList1[+A]  {

  def head: A
  def tail: MyList1[A]
  def isEmpty: Boolean
  def add[B >: A] (element: B): MyList1[B]
  def printElements: String
  //polymorphic call
  override def toString: String = "[" + printElements + "]"
}

object  Empty extends  MyList1[Nothing]{
  def head: Nothing = throw  new NoSuchElementException
  def tail: MyList1[Nothing] = throw  new NoSuchElementException
  def isEmpty: Boolean = true
  def add[B >: Nothing](element: B): MyList1[B] = new Cons(element, Empty)

  def printElements: String = ""
}

class Cons[+A](h: A, t: MyList1[A]) extends  MyList1[A] {
  def head: A = h
  def tail: MyList1[A] = t
  def isEmpty: Boolean = false
  def add[B >: A] (element: B): MyList1[B] = new Cons(element, this)

  override def printElements: String =
    if(t.isEmpty) "" + h
    else
      h +  " "  + t.printElements
}

object ListCheck1 extends App {

  val listOfIntegers: MyList1[Int] = new Cons(1, new Cons(2, new Cons(3, Empty)))
  val listOfStrings: MyList1[String]  = new Cons("hay", new Cons("Hello" , new Cons("hai", Empty)))

  println(listOfIntegers)
  println(listOfStrings )

}