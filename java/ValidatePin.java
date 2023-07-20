public class Solution {

  public static boolean validatePin(String pin) {
    try {
      int n = Integer.parseInt(pin);
      if (pin.charAt(0) == '-' || pin.charAt(0) == '+')
        return false;
      if ((pin.length() == 4 || pin.length() == 6))
        return true;
      return false;
    }
    catch(NumberFormatException e){  
      return false;  
    }
  }
}
