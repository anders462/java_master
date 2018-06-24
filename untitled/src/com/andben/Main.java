package com.andben;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static Button buttonPrint = new Button("Printing");

    public static void main(String[] args) {
//        GearBox volvo = new GearBox(5);
//        volvo.addGear(1, 0.1);
//        volvo.addGear(2, 0.2);
//        volvo.addGear(3, 0.3);
//        volvo.addGear(4, 0.4);
//        volvo.addGear(5, 0.6);
//        volvo.operateClutch(true);
//        volvo.changeGear(1);
//        volvo.operateClutch(false);
//        System.out.println(volvo.wheelSpeed(1500));
//
//        volvo.operateClutch(true);
//        volvo.changeGear(4);
//        volvo.operateClutch(false);
//
//        System.out.println(volvo.wheelSpeed(2500));


//        class ClickListener implements Button.OnClickListener {
//
//            public ClickListener() {
//                System.out.printf("I been attached");
//            }
//
//            @Override
//            public void onClick(String title) {
//                System.out.printf("Button " + title + " clicked");
//            }
//        }
//
//        buttonPrint.addListener(new ClickListener());


        // using anonymous class
          buttonPrint.addListener(new Button.OnClickListener() {
              @Override
              public void onClick(String title) {
                  System.out.println(title + " was clicked");
              }
          });


        listen();

    }

    private static void listen() {
        boolean quit = false;
        while (!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    buttonPrint.onClick();
                    break;
            }

        }
    }

}
