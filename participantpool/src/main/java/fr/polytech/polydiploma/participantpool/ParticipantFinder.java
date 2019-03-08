package fr.polytech.polydiploma.participantpool;

public interface ParticipantFinder {

    Participant findByName(String name);

    Participant findByRole(String role);

    int totalAmount();

    int amountByRole(String role);
}
