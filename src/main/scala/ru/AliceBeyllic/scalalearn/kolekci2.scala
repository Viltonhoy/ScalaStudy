package ru.AliceBeyllic.scalalearn

object kolekci2 {
  def main(args: Array[String]) = {
    val list = List(10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 140, 150)
    val charList: List[Int]=list.takeWhile(_ < 100).filter(_ % 4 == 0).collect{
      case i => i/4
    }
    charList.init.foreach(println)
  }
}
