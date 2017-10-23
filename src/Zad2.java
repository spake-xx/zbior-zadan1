import java.util.Scanner;

class Zad2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] values = new int[2];

        for(int i=0; i<values.length; i++){
            values[i] = reader.nextInt();
        }

        int max=values[0];
        int min=values[0];
        for(int i=1; i<values.length; i++){
            if(values[i]>max) max = values[i];
            if(values[i]<min) min = values[i];
        }

        System.out.println("Najwieksza wartosc: "+max);
        System.out.println("Najmniejsza wartosc: "+min);
    }
}