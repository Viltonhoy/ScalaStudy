package ru.AliceBeyllic.scalalearn



import scala.io.StdIn

object another2 {

  def main(args: Array[String]): Unit = {
    val n = StdIn.readLine().toInt
//    println(fibs(n))

  }

//  @tailrec
//  def fibs(n: Int, currentNumber: Int = 1, f1: BigInt = 0, f2: BigInt = 1): BigInt = {
//    if (n == currentNumber) {
//      f2
//    }
//    else if (n == 2)
//      f2
//    else {
//       dalee(n)
//
//    }
//  }

  def dalee(x:Int,y:Int=0): BigInt =
    dalee(x - 1) + dalee(x - 2,y+x)


  }
