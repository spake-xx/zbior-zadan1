import java.util.Scanner;

class Zad3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj wagę: ");
        float waga = reader.nextFloat();
        System.out.println("Podaj wzrost: ");
        float wzrost = reader.nextFloat();

        float bmi = waga / (wzrost * wzrost);

        System.out.println(bmi);

        if (bmi > 18.5 && bmi<24.9)
            System.out.println("Waga w normie!");
        else if(bmi>24.9)
            System.out.println("Nadwaga!");
        else
            System.out.println("Niedowaga!");
    }
}