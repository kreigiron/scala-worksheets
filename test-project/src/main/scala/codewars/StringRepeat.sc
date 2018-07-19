object StringRepeat {
  def repeatStr(times: Int, str: String):String = List.fill(times)(str).reduce(_.concat(_))

  repeatStr(6, "I")

  repeatStr(5, "Hello")

}
