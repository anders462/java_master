package com.example.andben;

import java.util.*;

public class Theatre {
    private final String theatreName;
    private List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numRows, int seatsPerRow ) {
        this.theatreName = theatreName;
        int lastRow = 'A' + (numRows - 1);
        for (char row = 'A'; row <= lastRow; row++) {
            for (int seatNum = 1; seatNum <= seatsPerRow; seatNum++) {
                Double price = 12.00;
                if (row < 'D' && (seatNum >= 4 && seatNum <= 9)) {
                    price = 14.00;
                } if (row > 'F' && (seatNum < 4 || seatNum > 9)) {
                    price = 7.00;
                }
                Seat seat = new Seat(row + String.format("%02d", seatNum), price);
                seats.add(seat);
            }
        }

    }

    public String getTheatreName() {
        return theatreName;
    }

    public boolean reserveSeat(String seatNumber) {
        Seat requestSeat = new Seat(seatNumber, 0.00);
        int foundSeat = Collections.binarySearch(seats, requestSeat, null);
        if (foundSeat >= 0) {
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("No seat with this number " + seatNumber + " in theatre " + this.getTheatreName());
            return false;
        }

    }

    public List<Seat> getSeats() {
        return seats;
    }

    public class Seat implements Comparable<Seat> {
        private final String seatNumber;
        private boolean reserved = false;
        private double price;

        public Seat(String seatNumber, Double price) {
            this.seatNumber = seatNumber;
            this.price = price;
        }

        public String getSeatNumber() {
            return seatNumber;
        }

        public double getPrice() {
            return price;
        }

        @Override
        public int compareTo(Seat seat) {
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }

        public boolean reserve() {
            if (!this.reserved) {
                this.reserved = true;
                System.out.println("Seat " + this.seatNumber + " was reserved");
                return true;
            } else {
                System.out.println("Seat " + this.seatNumber + " is already taken");
                return false;
            }

        }

        public boolean cancel() {
            if (this.reserved) {
                this.reserved = false;
                System.out.println("Reservation of seat " + this.seatNumber + " has been canceled");
                return true;
            } else {
                System.out.println("Seat " + this.seatNumber + " is not reserved");
                return false;
            }
        }

        public boolean isReserved() {
            return reserved;
        }
    }
}
