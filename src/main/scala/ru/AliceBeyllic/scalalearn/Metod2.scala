package ru.AliceBeyllic.scalalearn


object Metod2 {

  def main(args: Array[String]): Unit = {

  }

  def sendGift(currentAmount: Int, gift: Int) = {
    if (currentAmount >= 500)
      currentAmount + gift
    else
      currentAmount
  }

  val getGift = () => {
    println("The gift is received")
  }

  val accountAmounts = List(100, 200, 500, 300, 700)

    def num() = {
      val x: List[Int] = List(1, 2, 3)
      val y = x.filter(_ % 2 == 1)
      val f: Int => Int = { a: Int => a + 1 }
      val z = x.filter { a => a % 2 == 1 && a % 10 == 2 }


    }}
