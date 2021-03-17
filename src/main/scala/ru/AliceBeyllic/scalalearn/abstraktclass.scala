package ru.AliceBeyllic.scalalearn

import scala.io.StdIn

object abstraktclass {

  trait StringProcessor {
    def process(input: String): String
  }

  def main(args: Array[String]): Unit = {
    val Str = StdIn.readLine()
    val tokenDeleter:StringProcessor = new TiokenDeleter
    tokenDeleter.process(Str)

    val shortener = new // ???

    val toLowerConvertor = new
  }

  class TiokenDeleter extends StringProcessor {

    override def process(input: String): String = {
      val newinput = input.filter(c=> c != '.')
      newinput
    }


  }



}
