class Kata {
  public static String countingSheep(int num) {
    String sheepCounter = "";
    if (num == 0)
      return "";
    for (int i = 1; i <= num; i++)
      sheepCounter += Integer.toString(i) + " sheep...";
    return sheepCounter;
  }
}
