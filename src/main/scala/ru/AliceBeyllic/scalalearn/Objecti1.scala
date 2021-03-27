package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object FacedString {
  def apply(input: String) = s"*_*$input*_*"

  def unapply(arg: String): Option[String] = {
    var list = ""
    if (arg.startsWith("*_*") && arg.endsWith("*_*"))
      Some(arg.substring(3, arg.length - 3))
    else None
  }
}

object Objecti1 {
  def main(args: Array[String]) {
    StdIn.readLine() match {
      case FacedString(str) => println(str)
      case _ => println("Could not recognize string")
    }
  }
}
