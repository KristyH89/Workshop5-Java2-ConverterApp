package org.example;

import java.util.Scanner;
public class Valutaconverter {

    public static double SEKtoUSD(double sek) {
        double rate = 0.109;
        return sek * rate;
    }

    public static double USDtoSEK(double usd) {
        double rate = 9.20;
        return usd * rate;
    }

    public static double SEKtoEUR(double sek) {
        double rate = 0.0935;
        return sek * rate;
    }

    public static double EURtoSEK(double eur) {
        double rate = 10.70;
        return eur * rate;
    }
}