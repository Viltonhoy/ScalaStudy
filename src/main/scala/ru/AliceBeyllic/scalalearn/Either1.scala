package ru.AliceBeyllic.scalalearn

object Either1 {

  def main(args: Array[String]): Unit = {

  }

  def foo(options: List[Option[Int]]): List[Int] = {
    options. collect { case Some(x) => x }
//    options.flatten
  }


}
