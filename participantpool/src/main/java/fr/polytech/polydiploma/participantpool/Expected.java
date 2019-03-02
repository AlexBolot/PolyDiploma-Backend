package fr.polytech.polydiploma.participantpool;

public class Expected extends Participant {
    private String mail;
    private boolean attending;

    public Expected(String firstname, String lastname, String mail) {
        super(firstname, lastname);
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Expected{" +
                "mail='" + mail + '\'' +
                ", attending=" + attending +
                '}' + super.toString();
    }
}
