package School;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Classroom {
    private int number;
    private int numPlaces;
    private SchoolEquipment schoolEquipment;
    private static Set<SchoolEquipment> equipment = new HashSet<SchoolEquipment>();
    private static Set<Chair> chairs = new HashSet<>();
    private static Set<Desk> desks = new HashSet<>();
    private static Blackboard blackboard;


    public int getNumber() {
        return number;
    }

    public int getNumPlaces() {
        return numPlaces;
    }

    public Classroom(int number, int numPlaces) {
        this.number = number;
        this.numPlaces = numPlaces;
    }

    public Classroom(int number, int numPlaces, Set<SchoolEquipment> equipment) {
        this.number = number;
        this.numPlaces = numPlaces;
        this.equipment = equipment;
    }
    public Set<SchoolEquipment> collectShoolEquipment(Set<Chair> chairs, Set<Desk> desks, Blackboard blackboard){
        equipment.addAll(chairs);
        equipment.addAll(desks);
        if(blackboard != null) equipment.add(blackboard);

        return equipment;
    }
    public Set<Chair> addChairs(Chair... elements){
        chairs.addAll(Arrays.asList(elements));
        System.out.println("Krzesła (" + chairs.size()+ "szt.): ");
        for (Chair el:chairs) {
            System.out.println("Rozmiar: " + el.getName()+ ", nr ew.: " + el.getSerialNum());}

        return chairs;
    }
    public Set<Desk> addDesks(Desk... elements){
        desks.addAll(Arrays.asList(elements));
        System.out.println("Stoły:(" + desks.size()+ "szt.): ");
        for (Desk el:desks) {
            System.out.println("Rozmiar: " + el.getName()+ ", nr ew.: " + el.getSerialNum());}

        return desks;
    }
    public Blackboard addBlackboard(Blackboard blackboard){
        equipment.add(blackboard);
        System.out.println("Tablica: " + blackboard.getName() + ", nr ew. "+ blackboard.getSerialNum());
        return blackboard;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Classroom)) return false;
        Classroom classroom = (Classroom) o;
        return number == classroom.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "number=" + number +
                ", numPlaces=" + numPlaces +
                ", schoolEquipment=" + schoolEquipment +
                '}';
    }
}
