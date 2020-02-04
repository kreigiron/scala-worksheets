object DirReduction {
  def dirReduction(arr: Array[String]): Array[String] = {
    val result = arr.map(_.toUpperCase).map {
      case "NORTH" => (0, 1)
      case "SOUTH" => (0, -1)
      case "EAST" => (1, 0)
      case "WEST" => (-1, 0)
    } reduce ((p1, p2) => (p1._1 + p2._1, p1._2 + p2._2))

    val (x, y) = result

    (
      if (y > 0) Array.fill(y)("NORTH")
      else if (y < 0) Array.fill(-y)("SOUTH")
      else Array[String]()
      ) ++ (
      if (x > 0) Array.fill(x)("EAST")
      else if (x < 0) Array.fill(-x)("WEST")
      else Array[String]()
      )
  }

  dirReduction(Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST", "WEST"))

}