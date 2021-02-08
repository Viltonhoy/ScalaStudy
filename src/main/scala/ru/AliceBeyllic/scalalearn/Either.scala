package ru.AliceBeyllic.scalalearn

object Either {

  def main(args: Array[String]): Unit = {
    println(divide(
      (Int.MaxValue - 3, Int.MaxValue - 1))
      (Int.MaxValue - 2, Int.MaxValue - 1)
    )
  }

  def divide(p: (Int, Int))(q: (Int, Int)): Either[String, (Int, Int)] = {
   val s1=BigInt(p._1)
    val s2=BigInt(p._2)
    val z1=BigInt(q._1)
    val z2=BigInt(q._2)
    val s=(s1,s2)
    val z=(z1,z2)
    val a = (s._1 * z._2 / (s._1 * z._2).gcd(s._2 * z._1), s._2 * z._1 / (s._2 * z._1).gcd(s._1 * z._2))
    val j = (a._1.toInt,a._2.toInt)
//    for {
//      dp <- pravinul(p)
//      dq <- pravinul(q)
//      dpq <- nul(a)
//      res <- pravinul(a)
//    } yield res


    pravinul(p).flatMap { dp =>
      pravinul(q).flatMap { dq =>
        nul(j).flatMap { dpq =>
          pravinul(j)
        }
      }
    }
  }

  def pravinul(x: (Int, Int)): Either[String, (Int, Int)] = {
    if (Math.abs(x._2) <= Math.abs(x._1)) Left("Invalid input") else if (x._2 == 0 || x._1==0) Left("Zero divisor") else Right(x)
  }

  def nul(b: (Int, Int)): Either[String, (Int, Int)] = {
    if (Math.abs(b._1) - Math.abs(b._2) >= 0) Left("Improper Result") else if (b._2 == 0) Left("Zero divisor") else
      Right(b)

  }
}
