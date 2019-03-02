package fr.polytech.polydiploma.ceremonyplanification;

import fr.polytech.polydiploma.participantpool.Guest;

public class Main {
    public static void main(String[] args) {
        System.out.println("I'm ceremony planification");
        Guest guest = new Guest("Hugo", "Francois",false);
        System.out.println(guest);
    }
}
