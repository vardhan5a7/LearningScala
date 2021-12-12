package com.scala.oops

object AnonymousClass extends App {
  abstract class Animal {
    def eat: Unit
  }
  //This is actual defind
//  class AnonymousClass extends  Animal{
//    override def eat: Unit = println("ror rrorororor")
//  }
  //equivalent with

  //Anonymous Class
  val wildAnimal: Animal = new Animal {
    override def eat: Unit = println("ror rorororr")
  }
  println(wildAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hay hai may name is $name")
  }

  var johnwick = new Person("Jhonwick") {
    override def sayHi: Unit = println("hi wick how can i help you")
  }
}
