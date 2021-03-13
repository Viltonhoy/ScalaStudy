package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object for_comrehension_1 {

  def main(args: Array[String]): Unit = {
    val a: List[Int] = List(1, 3, 5, 7)
    val b = List(2, 4, 6, 8)
    val c = List(1, 3, 5, 8, 10, 12, 14)
    val list = sort(a, b, c)
    println(list.mkString("\n"))
  }

  def sort(a: List[Int], b: List[Int], c: List[Int]) = {
    val res = for {
      i <- a
      j <- b if j != i
      s <- c
      r = (i, j) if i * j == s
    } yield r
    res

  }

}