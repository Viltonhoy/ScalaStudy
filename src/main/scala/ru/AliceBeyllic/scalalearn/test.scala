package ru.AliceBeyllic.scalalearn

object Numbers extends App {

  import scala.math.BigDecimal.RoundingMode.HALF_UP

  def crispsWeight(weight: BigDecimal, potatoWaterRatio: Double, crispsWaterRatio: Double): BigDecimal = {
    val x = (weight * BigDecimal(crispsWaterRatio) / BigDecimal(potatoWaterRatio)).setScale(5, HALF_UP)
    x
  }

    require(
      crispsWeight(90.0, 0.9, 0.1) == BigDecimal(10.00000)
    )
}
