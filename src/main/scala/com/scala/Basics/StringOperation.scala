package com.scala.Basics

object StringOperation extends App {

  //String operation
  var str = "Hello hai im vardhan"

  //charAt opertion
  println(str.charAt(4));

  //substring operation
  println(str.substring(2, 7))

  //split opertion
  println(str.split(",").toList)

  //startWith Operation
  println(str.startsWith("Hello"))

  //replace Operation
  println(str.replace(" ", "_"))

  //toLowerCace Operation
  println(str.toLowerCase())

  //length operation
  println(str.length)

  //change string to int
  var str1 = "7"
  val intValue = str1.toInt
  println(intValue)

  //appending in string
  println('a' +: str1 :+ 'z')

  //reverse operation
  println(str.reverse)

  //take operation
  println(str.take(4))

  //Scala-Spacific : String Inerploaters
  //S-interpolaters
  val name = "jhon wick"
  val age = 34
  val data = s"hay my name is $name my age $age "
  val data1 = s"hay name is $name and my age is ${age + 1}"
  println(data)
  println(data1)

  //f-interpolaters
  val carSpeed = 120.89f
  var data2 = f"car owner $name car speed $carSpeed%2.2f"
  println(data2)

  //raw - intepolaters
  println(raw"This is my car \n and my house ")
  val str3 = "This is my new company \n I joined here"
  println(raw"$str3")
}
