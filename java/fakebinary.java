public class FakeBinary {
    public static String fakeBin(String numberString) {
      String binString = "";
      for (int i = 0; i < numberString.length(); i++) {
        if ((numberString.charAt(i) - '0') < 5)
          binString += '0';
        else
          binString += '1';
      }
        return binString;
    }
}
