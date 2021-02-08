package ru.AliceBeyllic.scalalearn

object Boolean {

  def main(args: Array[String]): Unit = {
    val result = isCapital( "Beyllic", 0); println(result)
  }
  def isCapital(word: String, pos: Int): Boolean = {
    val x = word
    val result = x.charAt(pos).isUpper
    result
  }
}
