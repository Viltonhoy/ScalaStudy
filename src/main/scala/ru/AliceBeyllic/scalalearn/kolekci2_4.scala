package ru.AliceBeyllic.scalalearn

object kolekci2_4 {

  abstract class DiffList[A](calculate: List[A] => List[A]) {
    def prepend(s: List[A]): DiffList[A]

    def append(s: List[A]): DiffList[A]

    def result: List[A]
  }

  final class DiffListImpl[A](listFunc: List[A] => List[A]) extends DiffList[A](listFunc) {
    override def prepend(s: List[A]) = {
      new DiffListImpl({ oldList: List[A] =>
        s ++ listFunc(oldList)
      })
    }

    override def append(s: List[A]) = new DiffListImpl({ oldList: List[A] =>
      listFunc(oldList) ++ s
    })


    override def result = listFunc(List.empty)


  }

}