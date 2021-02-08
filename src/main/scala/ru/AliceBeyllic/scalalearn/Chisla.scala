package ru.AliceBeyllic.scalalearn

import scala.math.BigDecimal.RoundingMode.HALF_UP

object Chisla {

  def main(args: Array[String]): Unit = {
    val x = crispsWeight(90.0, 0.9, 0.1);
    println(x)
  }

  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    val x = (weight * BigDecimal(crispsWaterRatio) / BigDecimal(potatoWaterRatio)).setScale(5, HALF_UP)
//    val x =(weight - (potatoWaterRatio * weight)) / (1 - crispsWaterRatio)
    x
  }

}