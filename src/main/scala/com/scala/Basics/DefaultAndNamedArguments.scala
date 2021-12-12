package com.scala.Basics

object DefaultAndNamedArguments extends App {

  def defaultAndNamedArguments(image: String = "jpg", hight: Int = 400, width: Int = 500): Unit =
    println("picture display " + hight)

  defaultAndNamedArguments(hight = 800)

  def defaultArgumentsUsingCar(model: String = "mustang", color: String = "black", price: Int = 3000): Unit =
    println(model, color, price)

  defaultArgumentsUsingCar()
  defaultArgumentsUsingCar(color = "orange", price = 70000)

}
