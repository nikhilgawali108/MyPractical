/*Create a class named 'Rectangle' with two data members 'length' and 'breadth' and 
two methods to print the area and perimeter of the rectangle respectively. 
Its constructor having parameters for length and breadth is used to initialize length and breadth
 of the rectangle.
Print the area and perimeter of a rectangle*/

public class Rectangle 
{
    int length;
    int breadth;
    
    public Rectangle(int l, int b) // parametrised constructor
	{
        length = l;
        breadth = b;
    }
    
    public void printArea() //methods
	{
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    
    public void printPerimeter() 
	{
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter of Rectangle: " + perimeter);
    }
    
    public static void main(String[] args) // main methods
	{
        Rectangle rect = new Rectangle(5, 10);
        
        rect.printArea(); 
        rect.printPerimeter(); 
    }
}
