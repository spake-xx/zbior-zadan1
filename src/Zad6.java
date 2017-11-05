import java.util.Scanner;

class Zad6 {
    public static void main(String[] args) {
        System.out.println("Jest to program do wykonywania prostych działań arytmetycznych.");
        Scanner reader = new Scanner(System.in);
        float firstNumber;
        float secondNumber;
        char symbol;
        System.out.println("Podaj pierwsza liczbe:");
        firstNumber = reader.nextFloat();
        System.out.println("Podaj symbol operacji:");
        symbol = reader.next().charAt(0);
        System.out.println("Podaj druga liczbe:");
        secondNumber = reader.nextFloat();

        switch(symbol){
            case '+':
                System.out.println(firstNumber+secondNumber);
                break;
            case '-':
                System.out.println(firstNumber-secondNumber);
                break;
            case '*':
                System.out.println(firstNumber*secondNumber);
                break;
            case '/':
                if(secondNumber==0)
                    System.err.println("Nie można dzielić przez 0!");
                else
                    System.out.println(firstNumber/secondNumber);

                break;
            default:
                System.out.println("Niedozwolona operacja: "+symbol+" !");
        }



    }
}