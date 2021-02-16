package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object ObobshMetod {
  def main(args: Array[String]): Unit = {
    val num = StdIn.readLine().toInt
    val p = fibs(num)
    println(p)

  }

  import scala.annotation.tailrec

  @tailrec
  def fibs(n: Int, currentNumber: Int = 0, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
    if (n <= currentNumber)
      f1
    else {
      fibs(n - 1, f2 = f2 + f1, f1 = f2)
    }
  }
}
