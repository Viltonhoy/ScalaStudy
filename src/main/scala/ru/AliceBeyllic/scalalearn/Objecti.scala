package ru.AliceBeyllic.scalalearn

case class Point(x: Double, y: Double, z: Double)

object Point {

  def apply (x: Double, y: Double, z: Double): Point = {
    new Point(x,y,z)
  }

  def average (list:List[Point]):Point = {
    if (list.isEmpty) Point.apply(0.0,0.0,0.0)
    else {
      val (xs: List[Double], ys, zs) = list.unzip3(p => (p.x, p.y, p.z))
      val x = xs.sum / xs.size
      val y = ys.sum / ys.size
      val z = zs.sum / zs.size
      Point.apply(x, y, z)
    }
  }

  def show(point: Point):String = {
    point.x.toString + " " + point.y.toString + " " + point.z.toString + " "
  }


  }


