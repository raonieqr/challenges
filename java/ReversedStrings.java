public class Kata {
  public class StringFormatter {  
      public static String reverseString(String str){  
        StringBuilder sb=new StringBuilder(str);  
        sb.reverse();  
        return sb.toString();  
  }  
}  
  
  public static String solution(String str) {
    return StringFormatter.reverseString(str);
  }
}
