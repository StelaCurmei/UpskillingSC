package md.scurmeiupskilling.classesandobjects.autoservicetask;

public class Car {
    String brand;

    String color;

    int nbOfDoors;

    int motorCapacity;

    public Car(String brand, String color, int nbOfDoors, int motorCapacity){
        System.out.println("This is a full constructor with all the params included");
        this.brand = brand;
        this.color = color;
        this.nbOfDoors = nbOfDoors;
        this.motorCapacity = motorCapacity;
        System.out.println("The object is created, bingo!");
    }
}
