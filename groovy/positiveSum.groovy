class Kata {
  static positiveSum(list) {
    int sum = 0
    
    if (!list.size()) 
      return 0
    
    list.each{l ->
      if (l > 0)
        sum += l
    }
    
    return sum
  }
}
