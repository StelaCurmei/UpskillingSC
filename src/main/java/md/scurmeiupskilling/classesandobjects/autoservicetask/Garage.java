package md.scurmeiupskilling.classesandobjects.autoservicetask;

public class Garage {
    String address;

    int nbOfBoxes;

    double dimensionSqFt;

    public Garage(String addressUseForInitialization, int nbOfBoxes, double dimensionSqFt){
        address = addressUseForInitialization;
        this.nbOfBoxes = nbOfBoxes;
        this.dimensionSqFt = dimensionSqFt;
    }
    public Garage(){
        System.out.println("A fost creat un obiect care insa nu are nici un parametru populat cu date concrete, " +
                "este constructor definit fara parametri");
    }

}
