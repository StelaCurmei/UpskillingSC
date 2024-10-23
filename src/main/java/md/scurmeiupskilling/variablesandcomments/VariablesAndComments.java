package md.scurmeiupskilling.variablesandcomments;

public class VariablesAndComments {
    public static void main(String[] args) {
        boolean isHotOutside;
        isHotOutside = true;
        System.out.println("The value of our variable is: "+isHotOutside);
        boolean isFriday = false;
        System.out.println("Is today Friday? - " +isFriday);
        char isMyName = 'S';
        System.out.println("My name starts with " +isMyName);
        byte myByteVar = 1;
        short myShortVar = 100;
        int myIntNegVar = -500;
        long myLongSmallVar = -9223372036854775808L;
        System.out.println("A negative integer variable would be: "+myIntNegVar);
        System.out.print("An example of byte variable is: "+myByteVar);
        System.out.println(", while a short variable can be: "+myShortVar);
        System.out.println("A long type variable can be as follows: "+myLongSmallVar);
    }
}
