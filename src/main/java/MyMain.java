import java.util.Scanner;

public class MyMain {

    // Calculates the factorial of a number
    public static double factorial(int x) {
        int total = 1;
        for (int i = 1; i < x+1; i++){
          total *= i;
        }
        return total;
    }

    // Calculates the value for the math constant e iteratively
    // goes until it calculates an answer less than 0.00000000001 
    // different from the value Math.E
    public static double calculateE() {
        // REPLACE WITH YOUR CODE HERE
        //has to be within 0.00000000001 of 2.718281828459045
        double e = 0.0;
        int counter = 0;
        while (Math.abs(e-2.718281828459045)>0.00001){

            e += 1/factorial(counter);
            counter += 1;
            System.out.println(e);

        }

        return e;
    }

    // Calculates the square root iteratively, using the Babylonian method
    //Let's assume that x is the inputted double
    //Start with a guess, n. n can be any positive number.
    //Use the following formula to get a better guess: m = (n + x/n) / 2
    //As m is a better guess than n, update the value of your guess (set n = m)
    //Repeat steps 1-4 (with a loop) until the difference between your current n value and your previous n value is less than 0.00001
    //At this point, n will be a very close approximation of the squareroot.
    public static double babylonian(double x) {
        // REPLACE WITH YOUR CODE HERE
        double n = 4.0;
        double m = (n + x/n) / 2;
        while (Math.abs(m-Math.sqrt(x))>0.00001){
            m = (n + x/n) / 2;
            n = m;
        }
        return m ;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println(calculateE());

        // YOUR CODE HERE


        

        scan.close();
    }
}
