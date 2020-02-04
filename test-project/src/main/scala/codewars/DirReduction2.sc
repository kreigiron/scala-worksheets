object DirReduction {
  def dirReduction(arr: Array[String]): Array[String] = {

    val inverses = Map (
      "NORTH" -> "SOUTH", "SOUTH" -> "NORTH", "EAST" -> "WEST", "WEST" -> "EAST"
    )

    def reduct(x: String, xs: Array[String], container: Array[String]): Array[String] = {


      else container + x
      container
    }


    reduct(arr.head, arr.tail, Array[String]())

  }

  dirReduction(Array("NORTH", "SOUTH", "SOUTH", "EAST", "WEST", "NORTH", "WEST", "WEST"))

}