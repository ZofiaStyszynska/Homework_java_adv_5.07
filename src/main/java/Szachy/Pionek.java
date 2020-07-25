package Szachy;

public class Pionek extends Figura{

    public Pionek (Kolor kolor, Punkt punkt){
        super("Pion", kolor, punkt);
    }

    @Override
    public void przesun(Punkt punkt) throws TenSamPunktEx{
        if (this.punktNaSzachownicy.equals(punkt)){
            throw new TenSamPunktEx("To samo pole");
        }
        System.out.println("Przesuwam pionek z "+ this.punktNaSzachownicy + " na " + punkt);
        this.punktNaSzachownicy = punkt;
    }

   }
