package OOP;

import java.time.LocalDate;

public class MainMeeting {
    public static void main(String[] args) {
        Meeting meeting1 = new Meeting("Spotkanie komisji skrutacyjnej",LocalDate.now(), "ul. Swięty Marcin 30", 12);

        System.out.println(meeting1.giveDescription());
        meeting1.delayMeeting(3);
    }
}
