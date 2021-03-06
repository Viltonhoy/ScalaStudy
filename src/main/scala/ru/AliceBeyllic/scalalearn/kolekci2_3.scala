package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object Naval {

  type Point = (Int, Int) // Клетка корабля - пара координат этой клетки на поле
  type Field = Vector[Vector[Boolean]] // Игровое поле - двумерный массив, хранящий для каждой ячейки булево значение - стоит ли на этой клетке корабль?
  type Ship = List[Point] // Корабль как список точек
  type Fleet = Map[String, Ship] // Множество всех кораблей на поле как ассоциативный массив. По строковому ключу (имени корабля) находится список точек корабля
  type Game = (Field, Fleet) // Игровое поле и список кораблей
}

object Lesson {
  val field = Vector(
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false),
    Vector(false, false, false, false, false, false, false, false, false, false)
  )
}

object kolekci2_3 {
  def main(args: Array[String]) {

    val size = StdIn.readLine().toInt
    var newgame: Naval.Game = (Lesson.field, Map())
    for (i <- 1 to size) {
      val name = StdIn.readLine()
      val twoname = name.split(" ")

      val vvod = LazyList.continually {
        StdIn.readLine()
      }.take(twoname(1).toInt).toList

      val parsed: List[Naval.Point] = vvod.map { s =>
        val split = s.split(" ")
        (split(0).toInt, split(1).toInt)
      }
      newgame = tryAddShip(newgame, twoname(0), parsed)
    }
    println(newgame._2.keys.mkString("\n"))
    //println(newgame._1.mkString(" \n "))

    import Naval.{Point, Field, Ship, Fleet, Game}

    def validateShip(ship: Ship): Boolean = {
      val (fx, fy) = ship.head
      val linearOnX: Boolean = ship.forall(c => c._1 == fx)
      lazy val linearOnY = ship.forall(c => c._2 == fy)

      def checkAscend(coords: List[Int]): Boolean = {
        (coords.last - coords.head) == coords.size - 1
      }

      if (linearOnX & ship.size <= 4) {
        checkAscend(ship.map(_._2))
      } else if (linearOnY & ship.size <= 4) {
        checkAscend(ship.map(_._1))
      } else false
    } // определить, подходит ли корабль по своим характеристикам
    def validatePosition(ship: Ship, field: Field): Boolean = {

      val fieldone = field.map(row => false +: row :+ false)
      val newfield = Vector(false, false, false, false, false, false, false, false, false, false, false, false) +:
        fieldone :+ Vector(false, false, false, false, false, false, false, false, false, false, false, false)


      val (fx, fy) = ship.head
      val lOnX: Boolean = ship.forall(c => c._1 == fx)

      if (ship.forall(c => c._1 != 0 && c._2 != 0)) {
        if (lOnX) {
          val new1 = newfield.slice(fy - 1, ship.last._2 + 2).map(row => row.drop(fx - 1).dropRight(row.size - (fx + 2)))
          new1.forall(row => row.forall(newrow => !newrow))
        }
        else {
          val new1 = newfield.drop(fy - 1).dropRight(newfield.size - (fy + 2)).map(row => row.slice(fx-1, ship.last._1 + 2))
          new1.forall(row => row.forall(newrow => !newrow))
        }
      }
      else false
    } // определить, можно ли его поставить
    def enrichFleet(fleet: Fleet, name: String, ship: Ship): Fleet = fleet + (name -> ship)// добавить корабль во флот
    def markUsedCells(field: Field, ship: Ship): Field = {

      val mutableField: Vector[Array[Boolean]] = field.map(_.toArray)

      ship.foreach(c => {
        //        val row: Array[Boolean] = mutableField(c._2)
        //        row(c._1) = true
        mutableField(c._2 - 1)(c._1 - 1) = true
      })
      val newfield = mutableField.map(_.toVector)
      newfield
    } // пометить клетки, которые занимает добавляемый корабль
    def tryAddShip(game: Game, name: String, ship: Ship): Game = {
      if (validateShip(ship)) {
        if (validatePosition(ship, game._1)) {
          val b = (markUsedCells(game._1, ship), enrichFleet(game._2, name, ship))
          b
        }
        else game
      }
      else game
    } // логика вызовов методов выше
  }
}

