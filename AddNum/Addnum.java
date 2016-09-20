// BIG BAD NUMBER ADDER
// Adds 2 numbers together.
public class Addnum
{
    // The sum of the two input doubles.
    private double num;
    
    // Input 2 numbers of type double.
    // Stores the sum of both numbers.
    // Example: Input "4.3" and "5.7". Stores sum of "10.0".
    public Addnum(double num1, double num2)
    {
        num = num1 + num2;
    }
    
    // Prints the value contained in the double "num".
    public void showAnswer()
    {
        System.out.println("The sum of the two numbers = " + num);
    }
}
