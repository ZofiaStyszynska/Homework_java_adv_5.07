package Szachy;

public class Hetman extends Figura{

    public Hetman(Kolor kolor, Punkt punkt){
        super("Hetman", kolor, punkt);
    }

    @Override
    public void przesun(Punkt punkt) {
        System.out.println("Przesuwam hetmana z "+ this.punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }

    @Override
    public void zbij(Punkt punkt) throws TenSamPunktEx {
        super.zbij(punkt);
        System.out.println("Jestem hetmanem");
    }
}
