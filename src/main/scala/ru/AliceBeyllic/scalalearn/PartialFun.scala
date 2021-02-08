package ru.AliceBeyllic.scalalearn

object PartialFun {
  case class Jar(name: String, value: Int, price: Double)
  def main(args: Array[String]): Unit = {

    val jars:List[Jar] = List(Jar ("Морской синий 6л", 5, 3000.0))
    println(jars.collect(discount))

  }




  def discount: PartialFunction[Jar, String] = {
    case Jar(x,y,z) if y >= 5 && y<=10 => x.toString +" "+(z*0.05).toString
    case Jar(x, y, z) if (y > 10) => x.toString +" "+(z*0.1).toString
  }

}
