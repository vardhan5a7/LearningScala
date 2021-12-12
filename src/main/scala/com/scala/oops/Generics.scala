package com.scala.oops

object Generics {
  //Generics
  class MyList[+A] {
    //use type of A
    def add[B >: A] (elementException: B): MyList[B] = ???
    /*
    A = Cat
    B = Animal
     */
  }

  val listOfIntegers = new MyList[Int]
  val listOfStrings = new MyList[String]

  //Generic methods
  object MyList {
    def empty[A]: MyList[A] = ???
  }
  val emptyListOfIntegers = MyList.empty[Int]

  //Variance problem
  class Animal
  class Cat extends  Animal
  class Dog extends  Animal

  //1. Yes List[Cat] extends List[Animal] = COVARIANCE
  class CovarianceList[+A]
  val animal: Animal = new Cat
  val animalList: CovarianceList[Animal] = new CovarianceList[Cat]
  //animalList.add(new Dog) ??? HARD QUESTION.

  //2. NO = INVARIANCE
  class InvarianceList[A]
  val invarianceAnimalList: InvarianceList[Animal] = new InvarianceList[Animal]

  //3. CONTRVARIANCE
  class Trainer[-A]
  val trainer: Trainer[Cat] = new Trainer[Animal]

  //Bounded Types
  class Cage[A <: Animal] (animal: A)
  val cage = new Cage(new Dog)

  class Car
  //Generic type needs proper bounded type
  //val newCage = new Cage(new Car)
}
