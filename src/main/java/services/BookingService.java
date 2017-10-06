package services;

/**
 * Created by markusthomassenkoteng on 25.09.2017.
 */
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;

@Path("/services/")
public class BookingService {

    public static Bord[] bord = new Bord[10];


    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Bord[] getBord(){
        return bord;
    }

    @GET
    @Path("/{bordId}")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<Booking> getBoookings(){
        return bord[Integer.parseInt("bordId")].getBookings();
    }

    @GET
    @Path("/bookings/display")
    @Produces(MediaType.APPLICATION_JSON)
    public ArrayList<services.Booking> display(){
        ArrayList<services.Booking> bookings = new ArrayList<>();
        for (int i = 0; i < bord.length; i++){
            ArrayList<Booking> temp = bord[i].getBookings();
            for (int j = 0; j < temp.size(); j++){
                bookings.add(temp.get(j));
            }
        }
        return bookings;
    }

    @POST
    @Path("/bookings")
    @Consumes(MediaType.APPLICATION_JSON)
    public void addBooking(Booking booking) {
        bord[3].addBooking(booking);
    }

    @DELETE
    @Path("/{bordId}/{bookingId}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void removeBooking(@PathParam("bordId") String bordId, @PathParam("bookingId") String bookingId) {
        this.bord[Integer.parseInt(bordId)].removeBooking(bookingId);
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public void populateBord(){
        for (int i = 0; i < bord.length; i++) {
            bord[i] = new Bord(String.valueOf(i));
        }
    }

}