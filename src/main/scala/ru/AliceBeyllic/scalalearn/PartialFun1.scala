package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object PartialFun1 {
  def main(args: Array[String]): Unit = {
    val num = StdIn.readLine().toDouble

    println()
  }

  val log1 = new PartialFunction[Double, Double] {

    def apply(x: Double) = math.log(x)

    def isDefinedAt(x: Double) = x < 0

  }


  val log: PartialFunction[Double, Double] = {

    case x if x > 0 => math.log(x)
  }

}
