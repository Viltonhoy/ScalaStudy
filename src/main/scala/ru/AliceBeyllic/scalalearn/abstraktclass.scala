package ru.AliceBeyllic.scalalearn

import scala.util.matching.Regex

object abstraktclass {

  trait StringProcessor {
    def process(input: String): String
  }

  def main(args: Array[String]): Unit = {


    val tokenDeleter = new StringProcessor {
      override def process(input: String): String = {
        val newinput = input.filterNot(c=> c == '.' ||c == ',' ||c == '!' ||c == '?' ||c == ':' ||c == ';')
        newinput
      }
    }

    val shortener = new StringProcessor {
      override def process(input: String): String = {
        if (input.length > 20) {
         input.dropRight(input.length-20) + "..."
      } else input
      }
    }

    val toLowerConvertor = new StringProcessor {
      override def process(input: String): String = {
        input.toLowerCase
      }
    }
  }
}
