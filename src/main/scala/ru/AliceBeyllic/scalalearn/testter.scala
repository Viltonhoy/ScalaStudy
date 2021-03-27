package ru.AliceBeyllic.scalalearn

object testter {
  import scala.util.Random

  object CustomerID {
    def main(args: Array[String]): Unit = {

      val customer1ID = CustomerID("Sukyoung")  // Sukyoung--23098234908
      customer1ID match {
        case CustomerID(name) => println(name)  // выведет Sukyoung
        case _ => println("Could not extract a CustomerID")
      }
    }
    def apply(name: String) = s"$name--${Random.nextLong}"

    def unapply(customerID: String): Option[String] = {
      val stringArray: Array[String] = customerID.split("--")
      if (stringArray.tail.nonEmpty) Some(stringArray.head) else None
    }
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