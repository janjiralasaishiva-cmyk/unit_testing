package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public int addition(int a, int b){
        return a + b;
    }

    public int subtract(int a, int b){
        return a - b;
    }

    public int multiply(int a, int b){
        return a * b;
    }

    public double divide(int a, int b){
        if(b == 0)
            throw new ArithmeticException("Divide by zero");
        return 1.0 * (a / b);
    }
    public static void main( String[] args )
    {
//        App app = new App();
//        app.addition(10, 20);
//        app.subtract(10, 20);
//        app.multiply(10, 10);
//        app.divide(10, 10);
    }
}
