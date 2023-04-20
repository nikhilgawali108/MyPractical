/*Write a program to create HashMap (Key-Value) of Students and perform following operations on it:
1. Check if the map contains the mapping for specified key(105)
2. Count the number of key-value(size) mapping in a map.
3. Copy the mapping from specified map to another map
*/
import java.util.HashMap;

public class Student {
    public static void main(String[] args) {
        // Create a HashMap of Students
        HashMap<Integer, String> students = new HashMap<Integer, String>();

        
        students.put(101, "Akshay");
        students.put(102, "Bharat");
        students.put(103, "sham");
        students.put(104, "ramesh");
        students.put(105, "sunder");

        
        if (students.containsKey(105)) {
            System.out.println("The map contains key 105");
        } else {
            System.out.println("The map does not contain  key 105");
        }

        // Count the number of key-value 
        int size = students.size();
        System.out.println("The number of key-value  is: " + size);

        // Create another HashMap and copy the mappings from the first map to it
        HashMap<Integer, String> copiedStudents = new HashMap<Integer, String>();
        copiedStudents.putAll(students);
        System.out.println("The mappings from the first map have been copied to the second map.");
    }
}

