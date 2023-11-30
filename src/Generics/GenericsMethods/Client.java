package Generics.GenericsMethods;

public class Client {
    public static void main(String[] args) {
        //        int x = GenericsMethod.getName(10); //For Static Method
        //---------------------------------------------------------------------
        GenericsMethod gm = new GenericsMethod(); // Without Static Method
        Object x = gm.getName("myName");

        System.out.println(x);
    }
}
