package com.example.andben;

import java.util.*;


public class Main {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Opus", 8, 12);
//        theatre.getSeats();
        if (theatre.reserveSeat("H05")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry seat taken");
        }


        printList(theatre.getSeats());
    }

    public static void printList(List<Theatre.Seat> list) {
        for (Theatre.Seat seat : list) {
            System.out.println("Seat number: "
                    + seat.getSeatNumber() + " price: " + seat.getPrice());
        }
    }
}
