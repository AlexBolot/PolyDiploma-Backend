import java.time.LocalTime;

public class Timeslot {
    private LocalTime start;
    private LocalTime end;

    public Timeslot(LocalTime start, LocalTime end) {
        this.start = start;
        this.end = end;
    }

    public void setStart(LocalTime start) {
        this.start = start;
    }

    public void setEnd(LocalTime end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Timeslot{" +
                "start=" + start +
                ", end=" + end +
                '}';
    }
}
