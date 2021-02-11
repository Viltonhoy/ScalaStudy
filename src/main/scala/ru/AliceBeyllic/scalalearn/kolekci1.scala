package ru.AliceBeyllic.scalalearn

import scala.util.Random

object kolekci1 {


  def main(args: Array[String]) {
    val ints: List[Int] = List.fill(Random.nextInt(15))(Random.nextInt(2))
    val sortlist = ints.sorted.partition(_ < 1)
    val b = new StringBuilder()
    println(sortlist._1.addString(b, ", "))
    b.clear()
    println(sortlist._2.addString(b, ", "))
  }

  def betterMain() {
    val ints: List[Int] = List.fill(Random.nextInt(15))(Random.nextInt(2))
    val (a, b) = ints.sorted.partition(_ < 1)
    println(s"${a.mkString(",")}\n${b.mkString(",")}")
  }

}
