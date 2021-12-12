package com.scala.oops

object AbstractDataTypes extends App {

  //abstract class
  abstract class Animal {
    val creatureType: String = "eat"
    def eat: Unit
  }

  class Cat extends Animal{
    override val creatureType: String = "wild cat"
    override def eat: Unit = println("noem noem")
  }

  val cat = new Cat
  cat.eat

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }
  trait ColdBlooded

  class Crocodile extends Animal with Carnivore with ColdBlooded {
    override val creatureType: String = "crocs"
    override def eat: Unit = println("nome nome")
    override def eat(animal: Animal): Unit = println(s"I' am croc i am eacting ${animal.creatureType}")

  }
  val cat1 = new Cat
  val crocodile = new Crocodile
  crocodile.eat(cat1)

  //NOTe
  //traits VS abstarct class
  //1.traits do not have constructor parameters
  //2.traits inheritance mutliple same class
  //3.using traits we achive multiple inheritance
  //4.traits are bheaviors
}
