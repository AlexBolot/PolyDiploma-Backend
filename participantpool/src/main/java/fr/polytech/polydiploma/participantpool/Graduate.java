package fr.polytech.polydiploma.participantpool;

import java.util.List;

public class Graduate extends Expected {

    List<Distinction> distinctions;
    Field field;
    List<Guest> guests;

    public Graduate(String firstname, String lastname, String mail) {
        super(firstname, lastname, mail);
    }

    public void addGuest(String firstName, String lastName) {
        if (guests.size() < 2) {
            this.guests.add(new Guest(firstName, lastName, false));
        } else {
            this.guests.add(new Guest(firstName, lastName, true));
        }
    }
}
