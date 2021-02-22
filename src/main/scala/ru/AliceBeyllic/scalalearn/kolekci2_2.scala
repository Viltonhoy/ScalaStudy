package ru.AliceBeyllic.scalalearn

object kolekci2_2 {
  def main(args: Array[String]) {
    val points: List[Int] = List(1, 3)
    val chr1: List[Char] = List('x', 'x', 'x', 'x', 'x')
    val chr2: List[Char] = List('y', 'y', 'y', 'y', 'y')
    val r = obmen(chr1, chr2, points)
    println(r._1.mkString(""))
    println(r._2.mkString(""))
  }

  def obmen(a: List[Char], b: List[Char], c: List[Int]): (List[Char], List[Char]) = c match {
    case x :: xs => {
      obmen(a.dropRight(a.size-x) ++ b.drop(x), b.dropRight(b.size-x) ++ a.drop(x), xs)
    }
    case List() => (a, b)
  }

}
