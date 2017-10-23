import java.util.Scanner;

class Zad1{
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Podaj stopnie celsjusza: ");
        float degree_C = reader.nextFloat();

        System.out.println("Jest to "+(degree_C*1.8+32.0)+" stopni Fahrenheita");
    }
}