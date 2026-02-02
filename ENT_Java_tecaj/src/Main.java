import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        characterCounter(scanner);
        scanner.close();
    }

    public static void characterCounter(Scanner scanner){

        System.out.print("Unesi string: ");
        String string = scanner.nextLine();

        int letters = 0;
        int digits = 0;
        int others = 0;

        for (int i = 0; i < string.length(); i++){
            char c = string.charAt(i);

            if (Character.isLetter(c)){
                letters++;
            } else if (Character.isDigit(c)){
                digits++;
            } else {
                others++;
            }
        }

        System.out.printf("Slova: %d%n", letters);
        System.out.printf("Brojevi: %d%n", digits);
        System.out.printf("Ostali znakovi: %d%n", others);
    }
}


