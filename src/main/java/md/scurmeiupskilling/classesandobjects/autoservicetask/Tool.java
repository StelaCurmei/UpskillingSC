package md.scurmeiupskilling.classesandobjects.autoservicetask;

public class Tool {
    String nameOfTool;
    String material;

    public Tool(String nameOfTool1, String material){
        nameOfTool = nameOfTool1;
        this.material = material;
        System.out.println("The constructor with param was used and the material is defined");
    };

}
