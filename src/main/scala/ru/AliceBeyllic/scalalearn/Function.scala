package ru.AliceBeyllic.scalalearn

object Function {

  def main(args: Array[String]): Unit = {

    val sia: (Int => Boolean, List[Int]) => List[Int] = LessonData.searchInArray
    val curriedSia: (Int => Boolean) => (List[Int] => List[Int]) = sia.curried
    val searchOdd1: List[Int] => List[Int] = sia.curried(_ % 2 == 1)


    val searchOdd: List[Int] => List[Int] = { a: List[Int] =>LessonData.searchInArray(_ % 2 == 1, a) }
    println(searchOdd(List(8, 11, 12)))
  }

  object LessonData {
    def searchInArray(cond: Int => Boolean, array: List[Int]): List[Int] = {
      array.filter(cond)

    }
  }


}
