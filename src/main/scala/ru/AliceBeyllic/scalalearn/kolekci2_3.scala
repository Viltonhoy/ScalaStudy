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

    def validateShip(ship: Ship): Boolean = {
      val (fx, fy) = ship.head
      val linearOnX: Boolean = ship.forall(c => c._1 == fx)
      lazy val linearOnY = ship.forall(c => c._2 == fy)

      def checkAscend(coords: List[Int]): Boolean = {
        (coords.last - coords.head) == coords.size - 1
      }

      if (linearOnX) {
        checkAscend(ship.map(_._2))
      } else if (linearOnY) {
        checkAscend(ship.map(_._1))
      } else false
//
//      var q: List[String] = List()
//      var w: List[String] = List()
//      val c = ship(1)
//      val g = ship.forall(y => y._1 == c._1 || y._2 == c._2)
//      if (g)
//        ship.foreach(x => q = x._1.toString :: q)
//      ship.foreach(x => w = x._2.toString :: w)
//      val q1 = q.map((q1: String) => q1.toInt).reverse
//      val w1 = w.map((w1: String) => w1.toInt).reverse
//      val q2 = q1.sorted
//      val w2 = w1.sorted
//      //            if (q1 == q2) true
//      //            else if (w1==w2) true
//      //            else false
//      val e = 0
//      val ab = q1.foldLeft(1)((m, n) => m+n)
//      for (i<-2 to q1.size) if (i - i-1==1) true
//      else false


    }
    // определить, подходит ли корабль по своим характеристикам


    def validatePosition(ship: Ship, field: Field) = {

      val newfield = field.map(row => "false" +: row :+ "false")

      val (fx, fy) = ship.head

     val shipone = newfield.dropRight(newfield.length - (fx+1)).map(row => row.dropRight(newfield.length-(fy+1)))
      shipone

//      for (x <- 0 to field.length - 1) {
//        for (y <- 0 to field.length - 1) {
//          print(" " + field(x)(y))
//        }
//        println()
//      }
    } // определить, можно ли его поставить
    println(validatePosition(List((1,2),(2,2),(3,2)),Lesson.field))
    def enrichFleet(fleet: Fleet, name: String, ship: Ship): Fleet = fleet + (name -> ship) // добавить корабль во флот
    def markUsedCells(field: Field, ship: Ship): Field = ??? // пометить клетки, которые занимает добавляемый корабль

    def tryAddShip(game: Game, name: String, ship: Ship): Game = ??? // логика вызовов методов выше
  }
}
