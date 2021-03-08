package ru.AliceBeyllic.scalalearn

import ru.AliceBeyllic.scalalearn.Naval.{Field, Ship}

object testter {

  def main(args: Array[String]): Unit = {

    def validatePosition(ship: Ship, field: Field): Boolean = {

      val fieldone = field.map(row => false +: row :+ false)
      val newfield = fieldone.head +: fieldone :+ fieldone.head

      val (fx, fy) = ship.head
      val lOnX: Boolean = ship.forall(c => c._1 == fx)

      if (ship.forall(c=> c._1 != 0 && c._2 != 0)) {
        if (lOnX) {
          val new1 = newfield.slice(fy, ship.length + 3).map(row => row.drop(fx - 1).dropRight(row.size - (fx + 2)))
          new1.forall(row => row.forall(newrow => !newrow))
        }
        else {
          val new1 = newfield.drop(fy - 1).dropRight(newfield.size - (fy + 2)).map(row => row.slice(fx, ship.length + 3))
          new1.forall(row => row.forall(newrow => !newrow))
        }
      }
      else false
    } // определить, можно ли его поставить

    println(validatePosition(List((1,6),(1,7),(1,8)),Lesson.field))
    println(validatePosition(List((0,0),(1,0),(2,2)),Lesson.field))

  }
}