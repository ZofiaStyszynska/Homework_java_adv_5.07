package Szachy;

public abstract class Figura implements Porusza{
    private final String nazwa;
    private final Kolor kolor;
    protected Punkt punktNaSzachownicy;

    protected Figura(String nazwa, Kolor kolor, Punkt punktNaSzachownicy) {
        this.nazwa = nazwa;
        this.kolor = kolor;
        this.punktNaSzachownicy = punktNaSzachownicy;
    }
    @Override
    public void zbij(Punkt punkt) throws TenSamPunktEx
    {
        przesun(punkt);
        System.out.println("Zbij figurę z "+ this.punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;

    }

    @Override
    public String toString() {
        return "nazwa='" + nazwa + '\'' +
                ", kolor=" + kolor +
                ", punkt na szachownicy=" + punktNaSzachownicy;
    }

    public boolean czyJuzNaTymPunkcie(Punkt punktDoPrzesuniecia){
        return this.punktNaSzachownicy.equals(punktDoPrzesuniecia);
    }
}
