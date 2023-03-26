// java program to create a calculation method to create object and access those method

interface Calculator //intreface
{
		public void Addition();
		public void Substraction();
		public void Multiplication();
		public void Division();
}

class DemoCalculator implements Calculator
{
		int a= 10; //data members
		int b= 5;
	public void Addition()
	{
		
		int sum=a+b;
		
		System.out.println("addition is: "+sum);
	}
	
	public void Substraction()
	{
		/* int a= 10;
		int b= 5; */
		
		int sub=a-b;
		
		System.out.println("Substraction is: "+sub);
	}
	
	public void Multiplication()
	{
		/* int a=10 ;
		int b= 5; */
		
		int mul=a+b;
		
		System.out.println("Multiplication is: "+mul);
	}
	
	public void Division()
	{
		/* int a= 10;
		int b= 5; */
		
		int div=a/b;
		
		System.out.println("Division is: "+div);
	}
}

class UseDemoCalculator
{
	public static void main (String args[]) //main method
	{
		DemoCalculator c1=new DemoCalculator();
		c1.Addition();
		c1.Substraction();
		c1.Multiplication();
		c1.Division();
	}
}