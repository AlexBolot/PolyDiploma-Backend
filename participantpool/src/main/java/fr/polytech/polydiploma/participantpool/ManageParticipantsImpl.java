package fr.polytech.polydiploma.participantpool;

import java.util.List;

public class ManageParticipantsImpl implements ManageParticipants {

    @Override
    public List<Participant> requireParticipants() {
        return null;
    }

    @Override
    public boolean confirmAttendance(Expected expected) {
        return false;
    }

    @Override
    public boolean inviteExpected(Expected expected) {
        return false;
    }
}
