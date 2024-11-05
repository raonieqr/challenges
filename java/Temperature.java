import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Temperature {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(); // the number of temperatures to analyse

        if (n == 0) {
            System.out.println("0");
            return;
        }

        List<Integer> temperatures = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int t = in.nextInt(); // a temperature expressed as an integer ranging from -273 to 5526
            temperatures.add(t);
        }

        if (temperatures.size() == 1) {
            System.out.println(temperatures.get(0));
            return;
        }

        temperatures.add(0);
        Collections.sort(temperatures);

        int idx = temperatures.indexOf(0);
        if (idx == 0) {
            System.out.println(temperatures.get(idx + 1));
            return;
        }

        if (idx == (temperatures.size() - 1)) {
            System.out.println(temperatures.get(idx - 1));
            return;
        }

        int nmb1 = temperatures.get(idx - 1);
        int nmb2 = temperatures.get(idx + 1);

        int negativeNumber = Math.abs(nmb1);

        if (negativeNumber > nmb2) {
            System.out.println(nmb2);
            return;
        }
        
        if (negativeNumber == nmb2) {
            System.out.println(nmb2);
            return;
        }
    }
}
