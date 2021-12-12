package com.scala.oops

import com.scala.oops.ScalaObjects.Person

object Inheritance extends App{
  //Inheritance concepts
  class Animal {
    val creatureType = "wild"
    protected def eat = println("nomnnomn")
  }

  class Cat extends  Animal{

    def crunch: Unit ={
       eat
      println("Crunch crumnch")
    }
  }

  val cat = new Cat
  cat.crunch

  //Constructor
  class Person(name: String, age: Int){
    def this(name: String) = this(name, 0)
      println("constractor")
  }
  class Adult(name: String, age: Int, idCard: Int) extends Person(name)

  //var adult = new Adult("d", 4,4)
  Person

  //Overriding
  class Dog(override val creatureType: String) extends Animal{

   // override val creatureType = "homepet"
    override  def eat: Unit = {
      super.eat
      println("Licking or Chew")
    }
  }
  val dog = new Dog("k9")
  dog.eat

  println(dog.creatureType)

  //type substitution (polymorphisam)
  val unknownAnimal: Animal = new Dog("k9")
}
