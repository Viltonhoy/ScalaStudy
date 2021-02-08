package ru.AliceBeyllic.scalalearn

import scala.util.matching.Regex

object PatternMatching {

  def main(args: Array[String]): Unit = {
//    val n = io.StdIn.readInt.toString
    //   val in: List[String] = n :: List()
    val in: List[String] = List("Alice alice@email.ru", "dfdsfsdfdf7")


    println(schet(in))
  }

  def schet(input: List[String]): String = {
    var res: String = ""
    val f = input.head

    val nameOnly: Regex = "([a-zA-Z]+)$".r
    val nameAndEmail: Regex = "([a-zA-Z]+) (\\w+@\\w+\\.\\w+)".r
    val result2 =  f match {
      case nameOnly(name) if input.size >= 2 && input(1).matches("\\w+@\\w+\\.\\w+") => s"$name ${input(1).split('@')(1)}"
      case nameAndEmail(name, email) => s"$name ${email.split('@')(1)}"
      case _ => "invalid"
    }

    return result2

    val result = input match {
      case List() => res
      case List(x) =>
        val s = x.split(' ')
        if (s(1) == " ") res = s(0)
        else {
          val a = s(1).split('@')
          res = res + s(0) + a(1)

        }
      case x :: y :: _ =>
      case List(x, y) =>
        val b = y.split('@')
        res = res + x + b(1)
      case _ => ()
    }
    res
  }
}

