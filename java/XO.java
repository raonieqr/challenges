import java.util.regex.*;

public class XO {
  
  public static boolean getXO(String str) {
    String stringToBeMatched = str.toLowerCase();
    
    Pattern charO = Pattern.compile("o");
    Pattern charX = Pattern.compile("x");

    Matcher findO = charO.matcher(stringToBeMatched);
    Matcher findX = charX.matcher(stringToBeMatched);
    
    int countO = 0;
    int countX = 0;
    
    while (findO.find())
      countO++;
    while (findX.find())
      countX++;
    return countO == countX;
  }
}

