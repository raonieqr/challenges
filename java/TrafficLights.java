public class TrafficLights {

  public static String updateLight(String current) {
    if (current == "green")
      return "yellow";
    if (current == "yellow")
      return "red";
    return "green";
  }
  
}
