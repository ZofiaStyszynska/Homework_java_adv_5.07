package Szachy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SzachyMain {
    public static void main(String[] args) {
        List<Figura> figury = new ArrayList<>(32);
        Pionek pionek1 = new Pionek(Kolor.BIAŁY, new Punkt('C', (byte) 2));
        Pionek pionek2 = new Pionek(Kolor.BIAŁY, new Punkt('D', (byte) 8));
        Hetman hetman1 = new Hetman(Kolor.BIAŁY, new Punkt('D', (byte) 4));
        Hetman hetman2 = new Hetman(Kolor.CZARNY, new Punkt('H', (byte) 4));

        figury.add(pionek1);
        figury.add(pionek2);
        figury.add(hetman1);
        figury.add(hetman2);
//        System.out.println("Przesuwanie");
//        for (Figura figura : figury) {
//            try {
//                figura.przesun(new Punkt('D', (byte) 5));
//            } catch (TenSamPunktEx e) {
//                e.getMessage();
//            }}

        Scanner scanner = new Scanner(System.in);
        Punkt punktDoPrzesuniecia;
        do {
            String kolumna = scanner.next();
            Byte wiersz = scanner.nextByte();
            punktDoPrzesuniecia = new Punkt(kolumna.charAt(0), wiersz);
        } while (pionek2.czyJuzNaTymPunkcie(punktDoPrzesuniecia));

        try {
            pionek2.przesun(new Punkt('D', (byte) 5));
        } catch (TenSamPunktEx e) {
            e.getMessage();
        }

    }
//        System.out.println("Zbijanie");
//        for (Figura figura:figury)
//        {figura.zbij(new Punkt('D',(byte)5));
//
//    }
}

