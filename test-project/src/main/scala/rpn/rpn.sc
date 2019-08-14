object rpn {
  println("RPN")

  (evaluate("2 1 +"))

  (evaluate("3 2 1.5 * 3 / *"))
  (evaluate("2 1 -"))
  (evaluate("1 2 -"))
  (evaluate("3 2 1 + *"))
  (evaluate("2 1 3 2 1 + * + /"))
  (evaluate("2 1 3 2 1 + * + / 5 *"))

  def execute(exprStack: List[String], evalStack: List[Double]) : Double = {
    //println("expr: " + exprStack)
    //println("eval: " + evalStack)
    if (exprStack.isEmpty)
      return evalStack.head
    else {
      val token = exprStack.head
      if (token.equals("+")) execute(exprStack.tail, evalStack.head + evalStack.tail.head :: evalStack.tail.tail)
      else if (token.equals("-")) execute(exprStack.tail, evalStack.head - evalStack.tail.head :: evalStack.tail.tail)
      else if (token.equals("*")) execute(exprStack.tail, evalStack.head * evalStack.tail.head :: evalStack.tail.tail)
      else if (token.equals("/")) execute(exprStack.tail, evalStack.head / evalStack.tail.head :: evalStack.tail.tail)
      else execute(exprStack.tail, token.toDouble :: evalStack)
    }

  }

  def evaluate(expr: String): Double = {
    println(expr)
    val tokens : List[String] = expr.split(" ").toList
    val stack : List[Double] = List.empty
    execute(tokens, stack)
  }
}

