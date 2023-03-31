/* 3.Create a parent class called "Vehicle" with attributes such as brand, model, year, and a method called "drive". 
Create a child class called "Car" that inherits from Vehicle and has an additional attribute called "color" and a method called "Type". 
Create an object of the Car class and call both the "drive" and "Type" methods.*/

class Vehicle // parent class
{
    String brand;
    String model;
    int year;

    public void drive() //method
	{
        System.out.println("Driving the car");
    }
}

class Car extends Vehicle // inherits parent class
{
    String color;

    public void type() 
	{
        System.out.println("Car");
    }
}

public class UseVehicle 
{
    public static void main(String[] args) // main methods
	
	{
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.model = "Camry";
        myCar.year = 2021;
        myCar.color = "Red";

        System.out.println("Brand: " + myCar.brand);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Color: " + myCar.color);

        myCar.drive(); // Output: Driving...
        myCar.type(); // Output: Car
    }
}
