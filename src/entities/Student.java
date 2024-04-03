package entities;

public class Student {
    public String name;
    public double grade1, grade2, grade3;

    public double Sum() {
        return grade1 + grade2 + grade3;
    }

    public double MissingPoints() {
        if (Sum() < 60.0) {
            return 60.0 - Sum();
        }
        else {
            return 0.0;
        }
    }
}