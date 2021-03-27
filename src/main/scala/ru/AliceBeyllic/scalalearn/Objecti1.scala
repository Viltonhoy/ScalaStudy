package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object FacedString {
  def apply(input: String) = s"*_*$input*_*"

  def unapply(arg: String): Option[String] = {

    if (arg.startsWith("*_*")) {



    }
    //arg.endsWith("*_*")

    //    val stringArray: Array[String] = arg.split("_")
//    if (stringArray(1).substring(1, stringArray.length-1 ).startsWith("*") ||
//      stringArray(1).substring(1, stringArray.length-1 ).isEmpty)  None
//    else Some (stringArray(1).substring(1,stringArray(1).length-1))


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
