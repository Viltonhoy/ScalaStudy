package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object Metod {
  def main(args: Array[String]): Unit = {
    val num = StdIn.readLine().toInt
    val p = vill(num)
    println(p)

  }

  def fibs(num: Int): Int = {
    if (num == 1) 1
    else if (num == 2) 1
    else {
      fibs(num - 1) + fibs(num - 2)
    }
  }


  def vill(num: Int, x: Int = 0): Int = {
    if (num == 1) x + 1
    else vill(num - 1, x + num)
    //num + vill(num-1)
  }

  def dalee(num: Int): Int = {
    var y1 = 1
    var y2 = 0
    var y3 = 0
    var x = 3
    do {
      y3 = y1
      y1 = y1 + y2
      y2 = y3
      x = x + 1
    } while (x <= num)
    y3 = y1 + y2
    y3
  }
}


