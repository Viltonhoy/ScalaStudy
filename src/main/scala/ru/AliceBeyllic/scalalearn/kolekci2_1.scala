package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object kolekci2_1 {
  def main(args: Array[String]): Unit = {
    val vvod = LazyList.continually {
      StdIn.readLine()
    }.takeWhile(_ != "END")
    val del = vvod.zipWithIndex.filter(t => t._2 % 2 != 0).map(_._1.toInt * 2).sum
    println(del)
  }
}



