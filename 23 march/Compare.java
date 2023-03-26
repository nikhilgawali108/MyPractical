// program to find the greatest of all 3 no.

class Compare
{
	public static void main (String args[])
	{
		int x=2;
		int y=5;
		int z=1;
		
		if (y>x && y>z)
		{
			System.out.println("greatest no is: "+ y);
		}
		
		else if (x>y && x>z)
		{
			System.out.println("greatest no is: "+ x);
		}
		
		else
		{
			System.out.println("greatest no is: "+ z);
		}
	}
}