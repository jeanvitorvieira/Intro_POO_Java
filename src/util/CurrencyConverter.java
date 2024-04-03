package util;

public class CurrencyConverter {
    public static final double IOF = 1.06;

    public static double Converter(double price, double dollar) {
        return IOF * price * dollar;
    }
}