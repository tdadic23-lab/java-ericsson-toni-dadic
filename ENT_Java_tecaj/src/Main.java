public class Main {
    public static void main(String[] args){
        printArmstrongNumbers();
    }

    public static void printArmstrongNumbers(){
        for(int i = 1; i < 10000; i++){
            int sum = 0;
            int temp = i;

            while (temp > 0){
                int digit = temp % 10;
                sum += digit * digit * digit;
                temp /= 10;
            }

            if(sum == i){
                System.out.println(i);
            }
        }
    }
}


