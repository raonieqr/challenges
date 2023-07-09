import java.io.*;
import java.util.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int x = scan.nextInt();
            list.add(x);
        }

        int q = scan.nextInt();

        for (int j = 0; j < q; j++) {
            String str = scan.next();

            if (str.equals("Insert")) {
                int a = scan.nextInt();
                int b = scan.nextInt();
                list.add(a, b);
            } else {
                int a = scan.nextInt();
                list.remove(a);
            }
        }

        for (int x : list) {
            System.out.print(x + " ");
        }
        
        scan.close();
    }
}


