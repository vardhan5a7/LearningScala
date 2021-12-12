package com.scala.Algorithms

object SortingAlgorithm extends  App {

  val arr =  Array(1,2,5,3,7,6,8,1,9,0)

  for(i <- 0 to arr.length - 1 )
    print(arr(i))

  println()
  //using buuble sort
  for(i <- 1 to arr.length - 1)
    for(j <- (i - 1) to 0 by - 1)
      if(arr(j) > arr(j + 1))
      {
        val temp = arr(j + 1)
        arr(j + 1) = arr(j)
        arr(j) = temp
      }
  println(arr.mkString(""))

  //using insertion sort
  for(i <- 1 to arr.length - 1) {
    var j = i - 1
    var key = arr(i)
    while(j >= 0 && arr(j) < key) {
      {
        arr(j  + 1) = arr(j)
        j -= 1
      }
      arr(j + 1) = key
    }
  }
  println(arr.mkString(""))

}
