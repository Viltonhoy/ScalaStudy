package ru.AliceBeyllic.scalalearn

class Point(x: Double, y: Double, z: Double)

object Point {

  def apply (x: Double, y: Double, z: Double): Point = {
    new Point(x,y,z)
  }

  def average (list:List[Point]):Point = {
    var x = 0
    var y = 0
    var z = 0
    list match  {

      case a :: as => {

      }
      case List() => Point (x,y,z)

//        val x = 0.0
//        val y = 0.0
//        val z = 0.0
//        val xs = list.unzip
//        println(xs._1)
    }
    }


  }


