package School;

import java.util.*;

public class MainSchool {
    private static final Set<Classroom> classroomList = new HashSet<>();


    public static void addClassroomToSet(Classroom classroom) throws AddException {

        if (!classroomList.add(classroom)) {
            throw new AddException("Sala o tym numerze już istnieje");
        }

    }

    public static void main(String[] args) throws AddException {

        Classroom classroom1 = prepareClassroom1();
        Classroom classroom2 = prepareClassroom2();



        addClassroomToSet(classroom1);
        addClassroomToSet(classroom2);


    }


    private static Classroom prepareClassroom1() {
        Classroom classroom1 = new Classroom(111, 14);
        Chair chair1 = new Chair("Small", "S001");
        Chair chair2 = new Chair("Small", "S002");
        Chair chair3 = new Chair("Medium", "M001");

        Desk desk1 = new Desk("Level1", "L1_001");
        Desk desk2 = new Desk("Level1", "L1_002");
        Desk desk3 = new Desk("Level2", "L2_001");
        Blackboard blackboard1 = new Blackboard("Tablica1", "T001");
        System.out.println("Sala  nr " + classroom1.getNumber() + ", il. miejsc: " + classroom1.getNumPlaces());
        System.out.println("Wyposażenie sali: ");
        //pierwszy sposób na wypisanie zawartości
        Set<SchoolEquipment> eq1 = classroom1.collectShoolEquipment(
                classroom1.addChairs(chair1, chair2, chair3),
                classroom1.addDesks(desk1, desk2, desk3),
                classroom1.addBlackboard(blackboard1));
        //drugi sposób - z wykorzystaniem interfejsu Collection
        System.out.println();
        System.out.println("Sala o numerze "+ classroom1.getNumber() + " o liczbie miejsc " + classroom1.getNumPlaces()+"\n Wyposażenie sali:");
        List<SchoolEquipment> equipmentList = new ArrayList<>(eq1);
        Collections.sort(equipmentList);
        for (SchoolEquipment el : equipmentList)
            System.out.println("Nazwa: " + el.getName() + " Numer ewidencyjny: " + el.getSerialNum());

        return classroom1;
    }
    private static Classroom prepareClassroom2() {
        Classroom classroom2 = new Classroom(112, 16);
        Chair chair1 = new Chair("Small", "S001");
        Chair chair2 = new Chair("Small", "S002");
        Chair chair3 = new Chair("Medium", "M001");

        Desk desk1 = new Desk("Level1", "L1_001");
        Desk desk2 = new Desk("Level1", "L1_002");
        Desk desk3 = new Desk("Level2", "L2_001");
        Blackboard blackboard1 = new Blackboard("Tablica1", "T001");
        System.out.println("Sala  nr " + classroom2.getNumber() + ", il. miejsc: " + classroom2.getNumPlaces());
        System.out.println("Wyposażenie sali: ");
        Set<SchoolEquipment> eq1 = classroom2.collectShoolEquipment(
                classroom2.addChairs(chair1, chair2, chair3),
                classroom2.addDesks(desk1, desk2, desk3),
                classroom2.addBlackboard(blackboard1));
    return classroom2;
    }
}
