import java.util.Scanner;

class Zad5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float cena_towaru;
        do {
            System.out.println("Podaj cenę towaru: ");
            cena_towaru = reader.nextFloat();
        }while(cena_towaru<100 || cena_towaru>1000);

        float liczba_rat;

        do {
            System.out.println("Podaj liczbe rat: ");
            liczba_rat = reader.nextFloat();
        }while(liczba_rat<6 || liczba_rat>48);

        double oprocentowanie=0;
        if(liczba_rat >= 6 && liczba_rat<=12){
            oprocentowanie = 1.025;
        }else if(liczba_rat>=13 && liczba_rat<=24){
            oprocentowanie = 1.05;
        }else if(liczba_rat>=25 && liczba_rat<=48){
            oprocentowanie = 1.1;
        }

        double rata = (cena_towaru/liczba_rat)*oprocentowanie;
        System.out.println("Miesieczna rata: "+rata+" złotych");
    }
}