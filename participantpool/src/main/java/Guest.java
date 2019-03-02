public class Guest extends Participant {

    private boolean payingGuest;
    private boolean hasPayed;

    public Guest(String firstname, String lastname, boolean payingGuest) {
        super(firstname, lastname);
        this.payingGuest = payingGuest;
        this.hasPayed = !payingGuest;
    }

    public boolean hasPayed() {
        return hasPayed;
    }

}
