package Szachy;

public enum Kolor {
    BIAŁY ("biały"), CZARNY("czarny");

    private final String nazwa;

    Kolor(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
