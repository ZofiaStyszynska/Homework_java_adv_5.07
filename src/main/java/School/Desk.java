package School;

public class Desk extends SchoolEquipment{

    public Desk(String name, String serialNum) {
        super(name, serialNum);
    }

    @Override
    public String toString() {
        return "Desks: " + super.toString() + "\n";
    }


}

