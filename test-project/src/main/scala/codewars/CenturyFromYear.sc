object CenturyFromYear {
  def centuryFromYear(year: Int): Int = {
    val lsd = (year % 100)
    val result = (year - year % 100) / 100
    if (lsd > 0) result + 1
    else result
  }

  centuryFromYear(1705)
  centuryFromYear(1900)

}
