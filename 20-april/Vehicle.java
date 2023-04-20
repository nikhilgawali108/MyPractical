/*Write a java program to create an ArrayList (Name of Vehicles) with 10 elements and do the following things:
1. Print the arraylist.
2. Iterate through the Array List and print the arraylist
3. Insert an element at start and end of arraylist.
4. retrieve an element at index number 4.
5. update the element at index number  7 with vehicle name XUV300.
6. Search for the element "verna" if it is found just print 'found the vehicle' else print 'not found'
7. Copy this arraylist to the new arraylist*/
//importing the ArrayList class
import java.util.ArrayList;

public class Vehicle {

    public static void main(String[] args) {

        //creating an ArrayList of string type named "vehicles"
        ArrayList<String> vehicles = new ArrayList<>();

        // add() method
        vehicles.add("Honda ");
        vehicles.add("Toyota ");
        vehicles.add("Suzuki ");
        vehicles.add("Scorpio");
        vehicles.add("Nissan ");
        vehicles.add("Kia ");
        vehicles.add("Hyundai ");
        vehicles.add("BMW");
        vehicles.add("Renault ");
        vehicles.add("Chevrolet ");


        System.out.println("ArrayList of vehicles: " + vehicles);

        //iterating  arraylist using for-each loop
        System.out.println("Iterating through the ArrayList:");
        for(String vehicle : vehicles) {
            System.out.println(vehicle);
        }

        //adding an element at the start
        vehicles.add(0, "Tata Nexon");

        //adding an element at the end
        vehicles.add("Mahindra Thar");

        //retrieving an element at index number 4 using the get() method
        System.out.println("Vehicle at index 4: " + vehicles.get(4));

        //updating  "XUV300" using the set() method
        vehicles.set(7, "XUV300");

        //searching for the element "verna" in the arraylist using the contains() method
        if(vehicles.contains("verna")) {
            System.out.println("Found the vehicle");
        } else {
            System.out.println("Not found");
        }

        //creating a new ArrayList named "newVehicles"
        // copying the elements of "vehicles" to it using the addAll() method
        ArrayList<String> newVehicles = new ArrayList<>();
        newVehicles.addAll(vehicles);


        System.out.println("New ArrayList of vehicles: " + newVehicles);

    }

}
