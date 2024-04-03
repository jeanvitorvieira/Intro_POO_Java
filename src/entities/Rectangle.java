package entities;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Rectangle {
    public double width;
    public double heigth;

    public double Area() {
        return width * heigth;
    }

    public double Perimeter() {
        return 2 * width + 2 *  heigth;
    }

    public double Diagonal() {
        return sqrt(pow(width, 2) + pow(heigth, 2));
    }
}