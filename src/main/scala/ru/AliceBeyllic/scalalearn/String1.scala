package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object String1 {

  def main(args: Array[String]): Unit = {
    val a = StdIn.readLine()
    val b = proverka(a)
    println(b)
  }

  def proverka(slovo: String): Boolean = {
    val a = slovo
    val b = !(a.startsWith("_") || a.endsWith("_") || a.contains("__") || !a.matches("[a-z_]*"))
    b
  }
}
