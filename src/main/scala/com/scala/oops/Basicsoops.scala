package com.scala.oops

object Basicsoops extends App{

  var perseon = new Persons("john" , 47)

  println(perseon.name)
  println(perseon.age)
  println(perseon.x)
  perseon.responsePersong("wick")
  perseon.responsePersong()

}

//constructor
class Persons(val name: String, var age: Int)
{
    var x = 7

    println(3 + 4)
   //method
   def responsePersong(name: String): Unit = println(s"${this.name} says to hai $name ")
    //method overloading
   def responsePersong(): Unit = println(s"$name")

   //multiple constructors
   def this(name: String) = this(name, 0)
}
