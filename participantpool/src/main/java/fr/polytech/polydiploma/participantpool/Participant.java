package fr.polytech.polydiploma.participantpool;

public class Participant {
    private String firstname;
    private String lastname;

    public Participant(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "Participant{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                '}';
    }
}
