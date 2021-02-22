package ru.AliceBeyllic.scalalearn

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

    import Naval.{Point, Field, Ship, Fleet, Game}
    import Lesson.field

    def validateShip(ship: Ship): Boolean = {
      val a=ship(1)
      ship.forall(y=>y._1==a._1||y._2==a._2)
//      val a = 0
//      val b = 0
//      ship match {
//        case x :: rest => {
//          val a1 = a + x._1
//          val b1 = b + x._2
//          if (a1 == a || b1 == b) validateShip(rest)
//          else false
//
//        }
      }
println(validateShip(List((2,2),(3,1),(4,1),(5,1))))

    // определить, подходит ли корабль по своим характеристикам







    def validatePosition(ship: Ship, field: Field): Boolean = ??? // определить, можно ли его поставить
    def enrichFleet(fleet: Fleet, name: String, ship: Ship): Fleet = fleet + (name -> ship) // добавить корабль во флот
    def markUsedCells(field: Field, ship: Ship): Field = ??? // пометить клетки, которые занимает добавляемый корабль

    def tryAddShip(game: Game, name: String, ship: Ship): Game = ??? // логика вызовов методов выше
  }
}
