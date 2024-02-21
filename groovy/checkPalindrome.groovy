boolean solution(String inputString) {
   StringBuilder reverseString = new StringBuilder();
   
   reverseString.append(inputString);
   reverseString.reverse();
   
   return reverseString.toString().equals(inputString);
}
