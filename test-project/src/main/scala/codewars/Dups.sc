import scala.collection.mutable.HashMap

object Dups {

  def duplicateCount(str: String): Int = {
    val h = HashMap[Char, Int]()
    val strUpper = str.toUpperCase()
    strUpper.map(c => h += (c -> strUpper.count(_.equals(c))))
    print(h)
    h.count(_._2 > 1)
  }

  duplicateCount("aaabbff")

}