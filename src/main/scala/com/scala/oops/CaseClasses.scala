package com.scala.oops
/*
 Case classes quick lightweight data structures with little boilerplate
 Companions already implemented
 Sensible equals, hashcode, toSring

 Auto promoted params to fields
 cloning
 and we use case classes using in objects
  */
object CaseClasses extends App {

  case class Person(name: String, age: Int)

  //1.class parameters are fields
  var jim = new Person("jim", 32)
  //No need use new keyword when we use case classes
  var luse = Person("luse", 24)
  println(jim.name)

  //2.Sensible toString
  println(jim.toString)
  //with equvivalent
  println(jim)

  //equals and hashcode implemented out of the box
  var jim2 = new Person("jim", 32)
  println(jim == jim2)

  //4. Case classes have handy copy methods
  val jim3 = jim.copy()
  println(jim3)
  val jim4  = jim.copy(age = 45)
  println(jim4)

  //5. case classes have companion objects it means no need use new keyword to create object
  val aperson = Person("un", 0)

  //6. case classes are serializable
  //Akka using most serializable

  //7.case classes extractor patterns = Case classes can be used pattern matching

  case object USA{
    def name: String = "The usa have great milatary "
  }
}
