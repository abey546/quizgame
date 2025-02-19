
// This program demonstrates the use of the Math class in Java. It shows how to use the Math class to perform various mathematical operations such as square roots, absolute values, powers, rounding, and random number generation.

public class mathModule {
    public static void main(String[] args){
        double x = 9.0;
        double y = 3.0;
        double z = -5.5;
        //square roots
        System.out.println("Square root of x: " + Math.sqrt(x));

        //absolute value
        System.out.println("absolute value of x: " + Math.abs(x));
        System.out.println("absolute value of x: " + Math.abs(z));

        //power
        System.out.println("x, raised to the power of y: " + Math.pow(x,y));

        //rounding
        System.out.println("(4.7) rounded to the nearest whole number: " + Math.round(4.7));
        System.out.println("(4.7) rounded down to the nearest whole number: " + Math.floor(4.7));
        System.out.println("(4.2) rounded up to the nearest whole number: " + Math.ceil(4.2));

        //random number generation
        System.out.println("Random number between 0 and 1: " + Math.random());
    }
}
