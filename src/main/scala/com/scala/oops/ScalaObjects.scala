package com.scala.oops

object ScalaObjects {

  //SCALA DOES NOT HAVE CLASS-LEVEL FUNCTIONALITY ("STATIC)
  object Person {  //type + its only instance
      //"class"/ "static" - level functionality
      val N_EYES = 2
      def canFay : Boolean = false
      def apply(mother:  Person, father: Person): Person = new Person("Bobbiew")
  }

  class Person(val name: String){
    //instance level functionalty
  }
  //COMPANIONS BOTH CLASS AND ONBJECTS
  def main(args: Array[String]): Unit = {
    println(Person.N_EYES)
    println(Person.canFay)

    //Scala objects  = Singleton instance
    val mary = Person
    val jhon = Person
    println(mary == jhon)

    val willasom = new  Person("willason")
    val wick = new Person("wick")
    println(wick == willasom)

    //Both are same
    var bobie = Person(willasom, wick)

    Person.apply(willasom, wick)

  }
}

