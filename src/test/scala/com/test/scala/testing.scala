package com.test.scala

import com.test.testing.Testing
import org.scalatest.funsuite.AnyFunSuite

class testing extends  AnyFunSuite{
  var testing = new Testing

  test(testName = "additon of operation"){
      assert(testing.add(2, 4) == 6)
      assert(testing.add(5, 5) == 10)
  }

  test(testName = "substraction of operation"){
      assert(testing.sub(2, 3) == -1)
      assert(testing.sub(1, 1) == 0)
  }
}
