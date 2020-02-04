object catTheory {
  def memoize (f: Int => Int) : Int => Int = {
    def g(g: Int) = {
      val value = f(g)

      if (g.equals(value)) value else g
    }
    g
  }


}