class Upper{
  static String makeUpperCase(String str){
    def word = str.collect{it -> it.toUpperCase()}
    return word.join("")
  }
}
