import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        reversewords();
    }

    public static void reversewords(){

        System.out.println("Unesi rečenicu: ");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] words = input.trim().split("\\s+");

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = words.length -1; i >= 0; i--){
            stringBuilder.append(words[i]);

            if (i > 0){
                stringBuilder.append(" ");
            }
        }

        System.out.println(stringBuilder);
    }
}


