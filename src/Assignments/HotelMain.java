package Assignments;

import java.util.Scanner;

    public class HotelMain {
        public static void main(String[] args) {
            Hotel luminariesHotel = new Hotel(40);
            System.out.println("Welcome to Luminaries hotel!!!");
            int sentinel = 1;
            while (sentinel != 0) {
                String prompt = """
                    Enter 1 to book a room
                    Enter 2 to check out
                    Enter 3 to check room details
                    Enter 0 to exit;
                    """;
                System.out.println(prompt);
                Scanner scanner = new Scanner(System.in);
                int userResponse = scanner.nextInt();
                scanner.nextLine();
                switch (userResponse) {
                    case 1 -> {
                        System.out.println("Enter your name");
                        String name = scanner.nextLine();
                        luminariesHotel.bookRoom(name);
                    }
                    case 2 -> {
                        System.out.println("Enter your room number");
                        int roomNumber = scanner.nextInt();
                        luminariesHotel.checkout(roomNumber);
                    }
                    case 3 -> {
                        System.out.println("Enter your room number to check details");
                        int roomNumber = scanner.nextInt();
                        String guest = luminariesHotel.getRoomGuest(roomNumber);
                        System.out.println("guest is " + guest);
                    }
                    case 0 -> {
                        sentinel = 0;
                        System.out.println("Thanks for staying in our hotel!!!");
                    }

                }
            }

        }
    }
