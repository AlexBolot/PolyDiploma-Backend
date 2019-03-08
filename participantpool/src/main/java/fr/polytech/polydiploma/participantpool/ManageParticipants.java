package fr.polytech.polydiploma.participantpool;

import java.util.List;

public interface ManageParticipants {

    List<Participant> requireParticipants();

    boolean confirmAttendance(Expected expected);

    boolean inviteExpected(Expected expected);
}
