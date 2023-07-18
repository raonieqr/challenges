import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();        
        
        if(s.isEmpty()) {
            System.out.println("0");
            return ;
        }
        String[] temp = s.trim().split("[\\t\\s\\W_]+");
        
        System.out.println(temp.length);
        
        for (String element: temp)
            System.out.println(element);
        scan.close();
    }
}

