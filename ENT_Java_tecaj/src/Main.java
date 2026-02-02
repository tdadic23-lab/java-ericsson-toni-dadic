import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        cashBack(scanner);
        scanner.close();
    }

    public static void cashBack(Scanner scanner){

        System.out.print("Unesite iznos za povrat: ");
        
        double amount = scanner.nextDouble();

        int cents = (int) Math.round(amount * 100);

        int[] valuesInCents = {50000, 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        double[] printValues = {500, 200, 100, 50, 20, 10, 5, 2, 1, 0.50, 0.20, 0.10, 0.05, 0.02, 0.01};

        System.out.println("Potrebno je vratiti:");

        for (int i = 0; i < valuesInCents.length; i++){

            int count = cents / valuesInCents[i];

            if (count > 0){
                System.out.printf("%d × %.2f €%n", count, printValues[i]);
                cents = cents % valuesInCents[i];
            }
        }
    }
}


