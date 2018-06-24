package com.andben;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        Player anders = new Player("Anders", 10, 100);
//        System.out.println(anders.toString());
//        saveObject(anders);
//
//        anders.setLifes(0);
//        System.out.println(anders);
//        anders.setScore(110);
//        System.out.println(anders);
//        saveObject(anders);
//
//        Player maria = new Player("", 0, 0);

//        loadObject(maria);
//        System.out.println(maria);

        ISaveAble hulk = new Monster("Green Hulk", "Monster", 12);
        System.out.println(hulk);
        System.out.println(((Monster) hulk).getName());
        saveObject(hulk);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveObject(ISaveAble objectToSave) {
        for (int i = 0; i < objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void loadObject(ISaveAble objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
