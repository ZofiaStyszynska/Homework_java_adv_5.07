package School;

public class Blackboard extends SchoolEquipment{
    public Blackboard(String name, String serialNum) {
        super(name, serialNum);
    }

    @Override
    public String toString() {
        return "Blackboard" + super.toString()+ "\n";
    }


}
