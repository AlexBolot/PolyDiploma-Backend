package fr.polytech.polydiploma.ceremonyplanification;

import fr.polytech.polydiploma.participantpool.Expected;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Map;

public class Planning {
    private Map<Timeslot, Expected> timeslots;
    private LocalDate dateOfCeremony;
    private LocalTime start;
    private LocalTime end;

    public Planning(LocalDate dateOfCeremony) {
        this.dateOfCeremony = dateOfCeremony;
        this.timeslots = new HashMap<>();
    }

    public void addTimeSlot(Timeslot t, Expected e) {
        timeslots.put(t, e);
    }
}
