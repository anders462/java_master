package com.andben;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList myList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;

        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice:\r");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myList.printGroveryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArraylist();
                case 7:
                    quit = true;
                    break;
                default:
            }
        }
        System.out.println("Good bye!");
    }

    private static void printInstructions() {
        System.out.println("\nEnter ");
        System.out.println("\t 0 - Print instructions.");
        System.out.println("\t 1 - Print list.");
        System.out.println("\t 2 - Add item.");
        System.out.println("\t 3 - Modify item.");
        System.out.println("\t 4 - Remove item.");
        System.out.println("\t 5 - Search for item.");
        System.out.println("\t 6 - Exit.");
    }

    private static void addItem() {
        System.out.println("Enter item");
        myList.addGroceryItem(scanner.next());
    }

    private static void modifyItem() {
        String newItem;
        String oldItem;
        System.out.println("Enter item to edit");
        oldItem = scanner.nextLine();
        System.out.println("Enter item name");
        newItem = scanner.nextLine();
        myList.modifyGroceryItem(oldItem, newItem);
    }

    private static void removeItem() {
        myList.printGroveryList();
        System.out.println("Enter item to delete");
        myList.removeGroceryItem(scanner.nextLine());
    }

    private static void searchItem() {
        boolean onFile;
        System.out.println("Enter search item name");
        onFile = myList.onFile(scanner.next());
        if (onFile) {
            System.out.println("item  exits");
        } else {
            System.out.println("No result found");
        }
    }


    private static processArrayList() {
        ArrayList<String> newArrayList = new ArrayList<>();
        newArrayList.addAll(myList.getGroceryList());

        // alt way of copy ArrayList
        // ArrayList<String> newArrayList = new ArrayList<>(myList.getGroceryList());

        //Copy ArrayList to and Array
        String[] myArray = new String[myList.getGroceryList().size()];
        myArray = myList.getGroceryList().toArray(myArray);

    }

}
