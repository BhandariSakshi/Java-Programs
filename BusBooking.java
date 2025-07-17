import java.util.*;

class Bus {
    int bNo;
    String Dest;
    String Source;
    boolean[] seats = new boolean[6]; 

    Bus(int busNo, String S, String D) {
        bNo = busNo;
        Dest = D;
        Source = S;
    }

    void displayInfo() {
        System.out.println("Bus No: " + bNo + " | From: " + Source + " | To: " + Dest);
    }

    boolean isSeatAvail(int seatNo) {
        return seatNo >= 1 && seatNo <= 5 && !seats[seatNo];
    }

    void bookSeat(int seatNo) {
        seats[seatNo] = true;
    }
}

class Passenger {
    String name;
    String date;
    int busNo;
    int seatNo;

    Passenger(String name, String date, int busNumber, int seatNumber) {
        this.name = name;
        this.date = date;
        this.busNo = busNumber;
        this.seatNo = seatNumber;
    }

    void showTicket() {
        System.out.println("Passenger: " + name + " | Date: " + date + " | Bus No: " + busNo + " | Seat No: " + seatNo);
    }
}

public class BusBooking {
    public static void main(String[] args) {
        Scanner sobj = new Scanner(System.in);

        Bus bus1 = new Bus(101, "Pune", "Mumbai");
        Bus bus2 = new Bus(102, "Delhi", "Agra");

        Passenger[] bookings = new Passenger[10];
        int bookingCount = 0;

        System.out.print("How many tickets do you want to book? ");
        int totalTickets = sobj.nextInt();
        sobj.nextLine(); 

        for (int i = 0; i < totalTickets; i++) {
            System.out.println("\nBooking Ticket " + (i + 1) + ":");
            bus1.displayInfo();
            bus2.displayInfo();

            System.out.print("Enter your name: ");
            String name = sobj.nextLine();

            System.out.print("Enter booking date: ");
            String date = sobj.nextLine();

            System.out.print("Enter bus number (101 or 102): ");
            int bno = sobj.nextInt();

            Bus selectedBus = (bno == 101) ? bus1 : (bno == 102) ? bus2 : null;

            if (selectedBus == null) {
                System.out.println("Invalid bus number. Skipping this booking.");
                sobj.nextLine(); 
                continue;
            }

            System.out.print("Enter seat number (1 to 5): ");
            int seat = sobj.nextInt();
            sobj.nextLine(); 

            if (!selectedBus.isSeatAvail(seat)) {
                System.out.println("Seat is already booked or invalid. Skipping this ticket.");
                i--; 
                continue;
            }

            selectedBus.bookSeat(seat);
            bookings[bookingCount++] = new Passenger(name, date, bno, seat);
            System.out.println("Ticket booked successfully!");
        }

        System.out.println("\n--- All Booked Tickets ---");
        for (int i = 0; i < bookingCount; i++) {
            bookings[i].showTicket();
        }

        System.out.println("\nThank you for using the Bus Booking System.");
    }
}
