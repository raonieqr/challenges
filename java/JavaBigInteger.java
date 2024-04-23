import java.io.*;
import java.util.*;
import java.math.BigInteger;


public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger n1 = new BigInteger(sc.nextLine());
        BigInteger n2 = new BigInteger(sc.nextLine());
        
        System.out.println(n1.add(n2));
        System.out.println(n1.multiply(n2));
    }
}
