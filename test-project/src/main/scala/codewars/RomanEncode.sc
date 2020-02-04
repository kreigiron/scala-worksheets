object RomanEncode {
  def encode(arabic: Int): String = {
    def encodeBase(number: Int, base: Int) {

    }
    encodeBase(arabic, Math.pow(10, Math.log10(arabic) + 1))
  }
}