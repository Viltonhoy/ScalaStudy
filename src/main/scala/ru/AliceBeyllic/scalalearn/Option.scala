package ru.AliceBeyllic.scalalearn

object Option {

  def main(args: Array[String]): Unit = {
    val in: List[Int] = List(1, 2, 3, 4, 5, 6)
    println(foo(in))
  }

  def foo(list: List[Int]): Int = {
    val a: Option[Int] = list.find(x => {
      x % 3 == 0
    })
    a match {
      case Some(x) => x * 2
      case None => 0
    }
  }
}
