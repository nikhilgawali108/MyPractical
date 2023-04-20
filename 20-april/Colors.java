/*Write a program to create a LinkedList(Colors) using collections in java and perform following operations on them:
1. Append "Red" at the end of the linked list
2. Iterate through all the elements of the linkedlist starting from the element 4
3. Iterate the linked list in the reverse order.*/
import java.util.LinkedList;
import java.util.ListIterator;

public class Colors {

    public static void main(String[] args) {
        // Create a LinkedList of colors
        LinkedList<String> colors = new LinkedList<>();

        // Append "Red" at the end of the LinkedList
        colors.add("pink");
        colors.add("black");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Blue");
        colors.add("Purple");
        colors.add("green");
        colors.add("White");
        colors.add("Grey");
        colors.addLast("Red");

        // Iterate starting from the element 4
        System.out.println("Iterating  from the element 4:");
        ListIterator<String> itr = colors.listIterator(4);
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // Iterate in reverse order
        System.out.println("Iterating in reverse order:");
        itr = colors.listIterator(colors.size());
        while (itr.hasPrevious()) {
            System.out.println(itr.previous());
        }
    }
}
