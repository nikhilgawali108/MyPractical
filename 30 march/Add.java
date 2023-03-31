/*Write a program in java showing overloading of Add method with 2 and 3 parameters.
In the user passes 2 values method with 2 parameter should be called if he passes 3 values method with 3 parameters should be called */

public class Add
 {
    
    public static void main(String[] args) //main method
	{
        Add abc = new Add();
        
        int sum1 = abc.Add(10, 20);
        System.out.println("Result1: " + sum1); // Output: Result1: 30
        
        int sum2 = abc.Add(10, 20, 30);
        System.out.println("Result2: " + sum2); // Output: Result2: 60
    }
    
    public int Add(int a, int b)
	{
        return a + b;
    }
    
    public int Add(int a, int b, int c) 
	{
        return a + b + c;
    }
}
