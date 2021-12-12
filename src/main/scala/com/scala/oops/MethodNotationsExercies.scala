package com.scala.oops

object MethodNotationsExercies extends App{
  class Person(val name: String, favoriteMovie: String,val age: Int = 1){
    def +(nickname: String): Person = new Person(s" $name ($nickname)", favoriteMovie)
    def unary_+ : Person = new Person(name, favoriteMovie, age + 1)
    def applay() : String = s"Hi,  my name  is $name and i like $favoriteMovie movie "

    def applay(n: Int) = s"$name watching $favoriteMovie $n times"

    def learns(course: String) = s"$name is learning $course"
    def learnsScala = this learns "Scala"

  }

  val mary = new Person("mary", "BlackPnathor")

  println(mary.applay())

  println((mary + "Rocky").applay())

  println((+mary).age)

  //using post notation
  println(mary learnsScala)

  println(mary applay(3))


}
