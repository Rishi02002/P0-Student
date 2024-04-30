package p0;

/**
 * A simple, functional interface for calculating Fibonacci numbers.
 */
@FunctionalInterface
public interface FibonacciCalculator {

    /**
     * Calculates and returns the {@code n}-th number of the Fibonacci sequence.
     * Valid parameters are any integers greater than 0.
     * If {@code n = 1} or {@code n = 2}, 1 is returned.
     * Otherwise, the sum of the last two numbers in the fibonacci sequence is returned.
     * @param n index of the number in the Fibonacci sequence
     * @return the Fibonacci number at index {@code n}
     * @throws IllegalArgumentException if {@code n} is non-positive
     */
    int get(int n);

    if ( n < 0 ) {
    throw new IllegalArgumentException ( " not Possible " );
    }


    if ( n == 1 || n == 2 ) {
    return 1; 
    }

 int first = 1;
     int second = 1;
for ( int i = 3; i <= n ; i++ ) {

    int Sum = first + second ;

    first = second; 
    second = Sum;
}
return second;
    
}
    

    
