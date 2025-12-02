public class Main {
    public static void main(String[] args){

        int limit = 20000;

        if (limit < 1){
            System.out.println("Limit mora biti veći od nule.");
        }
        else{
            System.out.println("Armstrongovi brojevi između 1 i " + limit + " su: ");

            for (int i = 1; i <= limit; i++){
                if (isArmstrong(i)){
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean isArmstrong(int number){
        int sum = 0;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            sum += digit * digit * digit;
            temp /= 10;
        }

        return sum == number;
    }
}


