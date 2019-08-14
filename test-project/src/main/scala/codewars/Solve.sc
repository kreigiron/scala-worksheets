
object Solve {
  // https://www.codewars.com/kata/which-x-for-that-sum/train/scala

  // interpolation solution (not efficient)
  def solve(m: Double): Double = {
    val error = 1e-12
    def sequence(n: Long)(x: Double): Double = {
      def seq(n: Long, x: Double, a: Double): Double = {
        if (n == 0) a
        else seq(n - 1, x, n * math.pow(x, n) + a)
      }
      seq(n, x, 0)
    }

    def interpolate(expected: Double, error: Double, f: Double => Double, limits: (Double, Double)): Double = {
      val intervalue = (limits._1 + limits._2) / 2
      val result = f(intervalue)
      if (math.abs(result - expected) <= error) intervalue
      else {
        if (result > expected) interpolate(expected, error, f, (limits._1, intervalue))
        else interpolate(expected, error, f, (intervalue, limits._2))
      }
    }
    interpolate(m, error, x => li_1(x), (0,1))
  }

  def li_1(z: Double): Double = z / math.pow(1 - z, 2)

  // math series solution (exact and efficient)
  def inv_li_1(y: Double): Double = (2*y - math.sqrt(4*y + 1) + 1) / (2*y)

  val s1 = solve(2.00)
  val s2 = solve(4.00)
  val s3 = solve(5.00)
  val m1 = li_1(s1)
  val m2 = li_1(s2)
  val m3 = li_1(s3)


  inv_li_1(2.0)
  inv_li_1(4.0)
  inv_li_1(5.0)
  //solve(500000.00)

}
