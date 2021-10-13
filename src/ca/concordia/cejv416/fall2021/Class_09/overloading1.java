package ca.concordia.cejv416.fall2021.Class_09;

public class overloading1 {

    public static void main(String[] args) {

        printSalutation();

        printSalutation("Salute!");

        printSalutation(123);

        printSalutation("Hi", 5);

    }

    public static void printSalutation(String salute, int times)
    {
        for(int x = 0; x < times; x++) {
            System.out.print(salute);
        }
        System.out.println();
    }

    public static void printSalutation()
    {
        System.out.println("Hello");
    }

    public static void printSalutation(String salute)
    {
        System.out.println(salute);
    }

    public static void printSalutation(int salute)
    {
        System.out.println(salute);
    }

}
