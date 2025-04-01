package lesson_13;

public class Vehicle {
    // NS-0001-AA
    private static int NEXT_CAR_NUMBER = 1;

    private String registration;
    private String maker; // Audi
    private String model; // A5
    private int year; // 2012

    public Vehicle(String maker, String model, int year) {
        this.maker = maker;
        this.model = model;
        this.year = year;
        this.registration = "00000" + NEXT_CAR_NUMBER;
        NEXT_CAR_NUMBER++;
    }

    @Override
    public String toString() {
        return registration + " " + maker + " " + model + " " + year;
    }
}
