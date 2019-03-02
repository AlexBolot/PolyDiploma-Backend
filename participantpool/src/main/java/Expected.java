public class Expected extends Participant {
    private String mail;
    private boolean attending;

    public Expected(String firstname, String lastname, String mail) {
        super(firstname, lastname);
        this.mail = mail;
    }
}
