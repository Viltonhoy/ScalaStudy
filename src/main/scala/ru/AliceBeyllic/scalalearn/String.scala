package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object String {


  def main(args: Array[String]): Unit = {
    val dano = StdIn.readLine()
    val slovo = StdIn.readLine()
    val z = razbor(dano, slovo)
    println(z)
  }

  def razbor(dano: String, slovo: String): String = {

    val p: Array[String] =dano.split(' ')
    val x1=p(0).toInt
    val x2=p(1).toInt
    val x3 = slovo.size
    val y1 = slovo.substring(x1, x2 + 1).reverse
    val y2 = slovo.substring(0, x1)
    val y3 = slovo.substring(x2 + 1, x3)
    val z = y2 + y1 + y3

    z

  }

}