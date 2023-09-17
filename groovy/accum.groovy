class Kata {
    static def accum(s) {
      int counter = 0
      String finalStr = ""
      for(int i = 0; i < s.size(); i++) {
        while(counter <= i) {
          if (counter == 0)
            finalStr += s[i].toUpperCase()
          else
            finalStr += s[i].toLowerCase()
          counter++
        }
        counter = 0
        finalStr += "-"
      }
      return finalStr[0 .. (finalStr.size()-2)]
    }
}
