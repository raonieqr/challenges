import java.util.Arrays;
public class Kata {
  public static String findNeedle(Object[] haystack) {
      int index = Arrays.asList(haystack).indexOf("needle");
      return "found the needle at position " + Integer.toString(index);
  }
}
