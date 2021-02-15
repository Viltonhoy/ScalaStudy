package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object kolelci1_1 {
  def main(args: Array[String]) {
    val ints: List[Int] = StdIn.readLine().split(" ").map(_.toInt).toList
    println(ints)
    val int: Int = StdIn.readLine().toInt

    def kOrder(list: List[Int], k: Int): Int = {
      val listsort = list.sorted
      println(listsort)
      listsort(k - 1)
    }

    println(kOrder(ints, int))
  }
}
