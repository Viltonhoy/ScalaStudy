package ru.AliceBeyllic.scalalearn

object for_comprehension_2 {

  def main(args: Array[String]):Unit ={


  def service1: Either[String, Double]
  def service2(res1: Double): Either[String, Int]
  def service3: String
  def service4(res1: Double, res2: Int, res3: String): Either[String, String]

  def result = service4(service1, service2(service1),service3)
    }
}
