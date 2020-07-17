package School;

public abstract class SchoolEquipment implements Comparable<SchoolEquipment> {
    private String name;
    private String serialNum;


    public SchoolEquipment(String name, String serialNum) {
        this.name = name;
        this.serialNum = serialNum;
    }

    public String getName() {
        return name;
    }

    public String getSerialNum() {
        return serialNum;
    }

    @Override
    public int compareTo(SchoolEquipment schoolEquipment) {
        return name.compareTo(schoolEquipment.name);
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", serialNum='" + serialNum + '\'' +
                '}';
    }
}
