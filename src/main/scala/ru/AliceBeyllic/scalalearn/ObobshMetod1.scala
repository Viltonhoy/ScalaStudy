package ru.AliceBeyllic.scalalearn

object ObobshMetod1 {
  def main(args: Array[String]): Unit = {

  }

  def middle[A](data: => Iterable[A]): A = {
    if (data.size % 2 == 0 && data.nonEmpty) {
      val tuple = data.splitAt(data.size / 2)
      tuple._2.head


    }
    else if (data.size % 2 != 0 && data.nonEmpty) {
      val tuple = data.splitAt(data.size / 2)
      tuple._2.head

    }
    else {
      None.asInstanceOf[A]
    }
  }

  require(middle("Scala") == 'a')
  require(middle(Seq(1, 7, 5, 9)) == 5)
}
