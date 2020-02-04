object PermutatedTuple {

  val intValues = List(1,2,3)
  val stringValues = List("a", "b", "c")

  val tuple = intValues.zip(stringValues)

  val a = () => new String

  def x (f: () => String) = f()

  x(a)


}