package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object for_comrehension_1 {

  def main (args:Array[String]):Unit={
    val a: List[Int] = StdIn.readLine().toList.map(c=>c.toInt)
    val b = StdIn.readLine().toList.map(c=>c.toInt)
    val c = StdIn.readLine().toList.map(c=>c.toInt)
    for ( i <- 0 until c.length-1)

  println(sort(a,b,c(i)))


    def sort (a:List[Int], b:List[Int], c:Int): List[(Int,Int)] ={
      for{

        i <- a
        j <- b if i + j ==c
      } yield (a(i),b(j))
    }
  }
}