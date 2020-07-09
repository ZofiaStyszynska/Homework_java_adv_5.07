import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
@Setter
public class Meeting {
    private String description;
    private LocalDate localDate = LocalDate.now();
    private String address;
    private int size;

    public Meeting(String description, String address) {
        this.description = description;
        this.address = address;

    }

    public Meeting(String description) {
        this.description = description;
    }

    public Meeting(String description,LocalDate localDate, String address, int size) {
        this.description = description;
        this.localDate = localDate;
        this.address = address;
        this.size = size;
    }

    public String giveDescription() {
        return description + " odbędzie się dnia: " + localDate + ", pod adresem: " + address + ", ilość miejsc: " + size;
    }

    public static void delayMeeting(int days) {
        LocalDate newMeetingDay = LocalDate.now().plusDays(days);
        System.out.println("Spotkanie zostało przełożone i odbędzie się: " + newMeetingDay);


    }
}
