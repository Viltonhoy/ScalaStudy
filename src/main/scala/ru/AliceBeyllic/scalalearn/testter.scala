package ru.AliceBeyllic.scalalearn

import ru.AliceBeyllic.scalalearn.Naval.{Field, Ship}

object testter {
  def main (args: Array[String]):Unit ={

    val nums = List(2,5,1,7,4)
    val nums2 = nums.flatMap(x => 1 to x)
    val nums21 = for(x <- nums; y<-1 to x)yield y*2
   println(nums2)
    println(nums21)
  }
//  def main(args: Array[String]): Unit = {
//
//    println(validatePosition(List((6, 1), (7, 1), (8, 1),(9, 1)), Lesson.field).mkString("\n"))
//
//    def validatePosition(ship: Ship, field: Field) = {
//
//      val fieldone = field.map(row => false +: row :+ false)
//      val newfield = fieldone.head +: fieldone :+ fieldone.head
//
//      val (fx, fy) = ship.head
//      val lOnX: Boolean = ship.forall(c => c._1 == fx)
//
//      if (ship.forall(c => c._1 != 0 && c._2 != 0)) {
//        if (lOnX) {
//          val new1 = newfield.slice(fy - 1, ship.last._2 + 2).map(row => row.drop(fx - 1).dropRight(row.size - (fx + 2)))
//          new1
//        }
//        else {
//          val new1 = newfield.drop(fy - 1).dropRight(newfield.size - (fy + 2)).map(row => row.slice(fx-1, ship.last._1 + 2))
//          new1
//        }
//      }
//      else None
//    } // определить, можно ли его поставить
//
//
//  }
}