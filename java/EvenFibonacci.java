public class EvenFibonacci {
    public static final long maxValue = 4000000L;
    
    public static long fibonacci(long number) {
        if (number > maxValue || number < 0)
            return -1;
            
        long sum = 0;
        long minNumber = 0;
        long maxNumber = 1;
        long aux = 0;
        
        while (aux <= number) {
            aux = minNumber + maxNumber;
            minNumber = maxNumber;
            maxNumber = aux;
            if (aux % 2 == 0)
                sum += aux;
        }
        return sum;
    }

    public static void main(String args[]) {
        long value = fibonacci(maxValue);
        if (value == -1) {
            System.out.println("Error invalid number");
            return;
        }
        System.out.println(value);
    }
}
