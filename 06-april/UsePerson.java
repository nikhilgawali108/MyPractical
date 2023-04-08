package com.company;
/*Write a java program using constructor overloading.
create a class Person with Id, Name, Designation.
Ask the user what are his inputs and according to that call the constructor.
For Eg: If he wants to add only ID and name then Desgination will be
default data or else if he wants to add Name and designation then ID will be default data*/

import java.util.Scanner;

class Person {
    int id;
    String name;
    String designation;

    // constructor with only id and name
    Person(int id, String name) {
        this.id = id;
        this.name = name;
        this.designation = "default";
    }

    // constructor with only name and designation
    Person(String name, String designation) {
        this.id = 0;
        this.name = name;
        this.designation = designation;
    }

    // constructor with all three parameters
    Person(int id, String name, String designation) {
        this.id = id;
        this.name = name;
        this.designation = designation;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
    }
}

public class UsePerson {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the details :");

        System.out.print("ID: ");
        int id = sc.nextInt();

        System.out.print("Name: ");
        String name = sc.nextLine();

        System.out.print("Designation (optional): ");
        String designation = sc.nextLine();

        if (designation.equals("")) {
            // call  with only id and name
            Person p = new Person(id, name);
            p.display();
        } else if (id == 0) {
            // call  with only name and designation
            Person p = new Person(name, designation);
            p.display();
        } else {
            // call  with all three parameters
            Person p = new Person(id, name, designation);
            p.display();
        }


    }
}
