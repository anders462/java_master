package com.andben;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
//        LinkedList<String> placesToVisit = new LinkedList<>();
//        placesToVisit.add("New York");
//        placesToVisit.add("Chicago");
//        placesToVisit.add("Los Angeles");
//        placesToVisit.add("San Francisco");
//        placesToVisit.add("Seattle");
//        placesToVisit.add("Portland");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Karlshamn");
//
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//
//        printList(placesToVisit);

        LinkedList<String> destination = new LinkedList<>();

        addInOrder(destination, "Dublin");
        addInOrder(destination, "London");
        addInOrder(destination, "Wales");
        addInOrder(destination, "Paris");
        addInOrder(destination, "Istanbul");
        addInOrder(destination, "New York");
//        printList(destination);
        visit(destination);

    }

    private static void printList(LinkedList<String> list) {
        Iterator<String> i = list.iterator();
        while (i.hasNext()) {
            System.out.println("Visiting: " + i.next());
        }
        System.out.println("\n________________________\n");
    }

    private static boolean addInOrder(LinkedList<String> list, String newCity) {
        ListIterator<String> stringListIterator = list.listIterator();
        while (stringListIterator.hasNext()) {
            int comparision = stringListIterator.next().compareTo(newCity);
            if (comparision == 0) {
                System.out.println("City " + newCity + " is already included");
                return false;
            }
            if (comparision > 0) {
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            }
            if (comparision < 0) {
                //move to next
            }

        }
        stringListIterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList cities) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean goingForward = true;
        int action;
        ListIterator<String> cityIterator = cities.listIterator();

        if (cities.isEmpty()) {
            System.out.println("No cities to visit");
            return;
        } else {
            System.out.println("Now visiting " + cityIterator.next());
            printMenu();
        }

        while (!quit) {
            action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Vacation over");
                    quit = true;
                    break;
                case 1:
                    if (!goingForward) {
                        cityIterator.next();
                        goingForward = true;
                    }
                    if (cityIterator.hasNext()) {
                        System.out.println("Welcome to " + cityIterator.next());
                    } else {
                        System.out.println("No more place to visit");
                        goingForward = false;
                    }
                    break;
                case 2:
                    if (goingForward) {
                        cityIterator.previous();
                        goingForward = false;
                    }
                    if (cityIterator.hasPrevious()) {
                        System.out.println("Welcome to " + cityIterator.previous());
                    } else {
                        System.out.println("No more place to visit");
                        goingForward = true;
                    }
                    break;
                case 3:
                    printMenu();
                    break;

            }
           }
        }

        private static void printMenu() {
            System.out.println("0-to exit");
            System.out.println("1-to travel forwards");
            System.out.println("2-to travel backwards");
            System.out.println("3-to print instructions");
        }

    }

