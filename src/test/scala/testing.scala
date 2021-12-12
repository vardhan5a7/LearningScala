import org.scalatest.funsuite.AnyFunSuite

class testing extends AnyFunSuite{
  val testing  = new  TestingScala

  test(testName = "additon"){

     println( assert(testing.add(1, 2) == 3))
     println( assert(testing.add(2, 2) == 4))
     print( assert(testing.add(2,4) == 6))

  }
}
