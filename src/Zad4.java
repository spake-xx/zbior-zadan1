import java.util.Scanner;

class Zad4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Podaj dochod: ");
        float dochod = reader.nextFloat();
        if(dochod<=85528){
            double podatek = 0.18*dochod - 556.02;
            if(podatek<0) podatek=0;
            System.out.println(podatek);
        }else{
            double podatek = 14839.02 + 0.32*(dochod-85528);
            System.out.println(podatek);
        }

    }
}