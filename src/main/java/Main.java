import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Meeting meeting1 = new Meeting("Spotkanie komisji skrutacyjnej",LocalDate.now(), "ul. Swięty Marcin 30", 12);

        System.out.println(meeting1.giveDescription());
        meeting1.delayMeeting(3);
    }
}
