package ru.AliceBeyllic.scalalearn

object PaternMatching1 {
  def main(args: Array[String]): Unit = {

  }

  case class Pet(name: String, says: String)

  val pet = Pet("dog", "nya")

  val isRobot = "([0-1]*)".r
  val kind = pet match {
    case Pet(name, "meow") => "cat"
    case Pet(name, "nya") => "cat"
    case Pet("Rex", says) => "dog"
    case Pet(name, isRobot(says)) => "robot"
    case _ => "unknown"
  }
  println(kind)
}
