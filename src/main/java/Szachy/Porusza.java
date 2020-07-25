package Szachy;

public interface Porusza {
    void przesun (Punkt punkt) throws TenSamPunktEx;
    void zbij (Punkt punkt) throws TenSamPunktEx;

}
