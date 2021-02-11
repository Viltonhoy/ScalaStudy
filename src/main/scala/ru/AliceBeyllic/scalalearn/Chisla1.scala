package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object Chisla1 {
  def main(args: Array[String]) {
    val c = StdIn.readLine().toInt
    val z = edinici(c)
    println(z)
  }

  def edinici(chislo: Int): Int = {
    var x: Int = chislo
    var z: Int = 0
    do {
      z= z + x % 2
      x= x / 2

    } while (x >= 1)
    z
  }


}

