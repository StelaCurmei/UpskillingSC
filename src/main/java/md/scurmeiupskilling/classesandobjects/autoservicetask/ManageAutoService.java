package md.scurmeiupskilling.classesandobjects.autoservicetask;

import java.awt.*;

public class ManageAutoService {
    public static void main(String[] args) {

        Garage masterLuxObject = new Garage("Str. Calea Orheiului 147", 3, 220);
        System.out.println(masterLuxObject.address);

        Garage autoLux = new Garage();
        autoLux.nbOfBoxes = 5;
        autoLux.dimensionSqFt = 250.6;
        autoLux.address = "Stefan cel Mare";

        System.out.println("Informatii despre obiectul autoLux de pe adresa " + autoLux.address +
                " cu numarul de boxe " + autoLux.nbOfBoxes + " si dimensiunea " + autoLux.dimensionSqFt);

        Tool hummer011 = new Tool("Hummer", "iron");
        System.out.println(hummer011.nameOfTool);
        System.out.println(hummer011.material);

        Tool key = new Tool("Lucky Key", "aluminium");
        System.out.println(key.nameOfTool + key.material);

        Worker ionelCelHarnic = new Worker("Ion");
        System.out.println(ionelCelHarnic.yearsOfExperience);

        Worker marcelCelPuternic = new Worker();

        Car masinaMea = new Car("HarleyDavidson", "Red", 3, 500);
        System.out.println(masinaMea.brand);
        Car masinaDanei = new Car("BMW", "grey", 3, 1000);
        System.out.println(masinaDanei.color);

    }
}