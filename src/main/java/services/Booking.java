package services;

/**
 * Created by markusthomassenkoteng on 04.10.2017.
 */

import java.util.ArrayList;
import java.util.Date;

public class Booking {

    private String bookingId;
    private Date bookingTidspunkt;
    private int antallGjester;
    private ArrayList<String> forrett = new ArrayList<>();
    private ArrayList<String> hovedrett = new ArrayList<>();
    private ArrayList<String> dessert = new ArrayList<>();
    private ArrayList<String> drikke = new ArrayList<>();
    private int kredittkort;
    private Date utlopsdato;
    private int kontrollsiffer;

    public Booking(){}

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingTidspunkt() {
        return bookingTidspunkt;
    }

    public void setBookingTidspunkt(Date bookingTidspunkt) {
        this.bookingTidspunkt = bookingTidspunkt;
    }

    public int getAntallGjester() {
        return antallGjester;
    }

    public void setAntallGjester(int antallGjester) {
        this.antallGjester = antallGjester;
    }

    public ArrayList<String> getForrett() {
        return forrett;
    }

    public void setForrett(ArrayList<String> forrett) {
        this.forrett = forrett;
    }

    public ArrayList<String> getHovedrett() {
        return hovedrett;
    }

    public void setHovedrett(ArrayList<String> hovedrett) {
        this.hovedrett = hovedrett;
    }

    public ArrayList<String> getDessert() {
        return dessert;
    }

    public void setDessert(ArrayList<String> dessert) {
        this.dessert = dessert;
    }

    public ArrayList<String> getDrikke() {
        return drikke;
    }

    public void setDrikke(ArrayList<String> drikke) {
        this.drikke = drikke;
    }

    public int getKredittkort() {
        return kredittkort;
    }

    public void setKredittkort(int kredittkort) {
        this.kredittkort = kredittkort;
    }

    public Date getUtlopsdato() {
        return utlopsdato;
    }

    public void setUtlopsdato(Date utlopsdato) {
        this.utlopsdato = utlopsdato;
    }

    public int getKontrollsiffer() {
        return kontrollsiffer;
    }

    public void setKontrollsiffer(int kontrollsiffer) {
        this.kontrollsiffer = kontrollsiffer;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingTidspunkt" + bookingTidspunkt +
                ", antallGjester=" + antallGjester +
                ", forrett=" + forrett.toString() +
                ", hovedrett=" + hovedrett.toString() +
                ", dessert=" + dessert.toString() +
                ", drikke=" + drikke.toString() +
                ", kredittkort=" + kredittkort +
                ", utløpsdato=" + utlopsdato +
                ", kontrollsiffer=" + kontrollsiffer +
                '}';
    }
}