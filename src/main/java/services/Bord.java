package services;

/**
 * Created by markusthomassenkoteng on 04.10.2017.
 */

import java.util.ArrayList;

public class Bord {

    private String bordId;
    private ArrayList<Booking> bookings = new ArrayList<>();

    public Bord(String bordId){
        this.bordId = bordId;
    }

    public String getBordId() {
        return bordId;
    }

    public void setBordId(String bordId) {
        this.bordId = bordId;
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public boolean addBooking(Booking nyBooking){
        System.out.println("Start addBooking");
        if(bookings.isEmpty()) {
            this.bookings.add(nyBooking);
            return true;
        }
        for (Booking booking : bookings) {
            if(nyBooking.getBookingTidspunkt() != null && !booking.getBookingTidspunkt().equals(nyBooking.getBookingTidspunkt())){
                this.bookings.add(nyBooking);
                return true;
            }
        }
        return false;
    }

    public boolean removeBooking(String bookingId){
        bookings.remove(0);
        return true;
    }
}