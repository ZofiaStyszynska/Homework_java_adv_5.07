package School;

public class Chair extends SchoolEquipment{
    public Chair(String name, String serialNum) {
        super(name, serialNum);
    }

    @Override
    public String toString() {
        return "Chair: " + super.toString() + "\n";
    }


}
