package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object klass {

  class Waiter(name: String, order:List[String]) {
    println(s"My name $name")

    var ord: List[String] = order

    def giveMe(a:String): Waiter={
      ord = ord :+ a
      this
    }
    def complete(): List[String] = ord
  }
  def main(args: Array[String]): Unit = {
    val a: Jopa = new SmallJopa
    val b: Jopa = new BigJopa
    val c: Jopa = new Jopa {
      override val size: Int = 10
    }
  }
}


trait Jopa {

  val size: Int

}

class SmallJopa extends Jopa {

  override val size: Int = 3

}

class BigJopa extends Jopa {

  override val size: Int = 30

}