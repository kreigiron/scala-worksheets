object LoveVsFriendship {

  def loveVsFriendship(s: String) = s.map(_.toByte - 96).reduce(_ + _)

  loveVsFriendship("a")
  loveVsFriendship("love")
  loveVsFriendship("attitude")


  val a = Vector(1.0, 2.0, 3.0, 4.0)

  val mean = a(a.size / 2)

  def factorial(n: Int) : Long = {
    if (n == 0) 1
    else if (n == 1) 1
    else n * factorial(n - 1)
  }

  factorial(5)

}
