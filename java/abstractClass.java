import java.io.*;
import java.util.*;

abstract class Book{
  String title;
  abstract void setTitle(String s);
  String getTitle(){
    return title;
  }
}

class MyBook extends Book{
  String title;
  
  void setTitle(String s){
    title = s;
  }
  
  @Override
  String getTitle(){
    return "The title is: " + title;
  }
}

public class Solution {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    MyBook mb = new MyBook();
    
    mb.setTitle(sc.nextLine());
    sc.close();
    
    System.out.println(mb.getTitle());
  }
}
