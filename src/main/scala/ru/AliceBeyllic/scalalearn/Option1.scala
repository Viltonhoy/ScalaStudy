package ru.AliceBeyllic.scalalearn

object Option1 {

  def main(args: Array[String]): Unit = {

  }

  def bar(x: Int): Option[Int] = {
    Some(x - 4)
  }

  val x: Option[Int] = None
  def vhod(vh: Option[Int]): Option[Int] = {
    vh match{
      case Some(s) => bar(s)
      case None => None
    }
  }
  println(vhod(x))



}