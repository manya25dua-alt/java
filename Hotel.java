


public class Hotel {

    String roomNo;
    String guestName;
    String roomType;
    boolean booked;

    void assignRoom(String room, String guest, String type) {

        this.roomNo = room;
        this.guestName = guest;
        this.roomType = type;
        booked = true;
    }

    void bookRoom() {

        if (!booked) {
            booked = true;
            System.out.println("Room Booked Successfully.");
        }
        else {
            System.out.println("Room Already Booked.");
        }
    }

    void checkout() {

        if (booked) {
            booked = false;
            System.out.println("Checkout Successful.");
        }
        else {
            System.out.println("Room is Already Available.");
        }
    }

    void displayRoom() {

        System.out.println("Room Number : " + roomNo);
        System.out.println("Guest Name : " + guestName);
        System.out.println("Room Type : " + roomType);

        if (booked)
            System.out.println("Status : Booked");
        else
            System.out.println("Status : Available");
    }
}

