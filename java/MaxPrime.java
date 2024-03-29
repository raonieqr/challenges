import java.lang.Math;

public class MaxPrime {
    public static final long number = 600851475143L;
    
    public static boolean checkPrime(long number) {
        boolean backValue = false;
        if (number > 2) {
            for(long i = 2; i < Math.sqrt(number); i++) {
                if (number % i == 0)
                    return backValue;
            }
            backValue = true;
        }
        return backValue;
    }
    
    public static void main(String args[]) {
        long max = 0;
        for (long i = 1; i < Math.sqrt(number); i++) {
            if(checkPrime(i) && number % i == 0)
                max = i;
        }
        System.out.println(max);
    }
}
