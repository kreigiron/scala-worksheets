object BackwardsPrime {

  def isPrime(n: Long): Boolean = !((2l until n - 1l) exists (n % _ == 0))

  def backwardsPrime(start: Long, nd: Long): String = {
    val primes = for ( i <- start to nd if !i.toString.reverse.equals(i.toString) && isPrime(i) && isPrime(i.toString.reverse.toLong)) yield(i)
    if (!primes.isEmpty) primes.map(_.toString).reduce((a, b) => a + "," + b) else ""
  }


  backwardsPrime(1,20)

  backwardsPrime(2, 100)
  backwardsPrime(9900, 10000)
  backwardsPrime(180, 209)
  backwardsPrime(496, 500)



}
