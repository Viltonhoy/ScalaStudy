package ru.AliceBeyllic.scalalearn

abstract class DiffList[A](calculate: List[A] => List[A]) {
  def prepend(s: List[A]): DiffList[A]

  def append(s: List[A]): DiffList[A]

  def result: List[A]

final class DiffListImpl[A](listFunc: List[A] => List[A]) extends DiffList[A](listFunc) {
  def prepend(s: List[A]) = {

  val newprep = s :+ newprep
  }
}

  def append(s: List[A]) = ???

  def result = ???
}

object kolekci2_4 {

}
