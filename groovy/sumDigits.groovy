class Kata{
    static int sumDigits(number) {
      int result = 0
      String numberStr = number.toString()
      numberStr = numberStr.replace("-", "")

      numberStr.each{numberToInt ->
        result += Integer.parseInt(numberToInt )
      }
      return result
    }
}
