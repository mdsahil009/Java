import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("=== Prime number ===");
        System.out.print("Enter the number : ");
        int num = input.nextInt();

        boolean primeNum = primeNumber(num);
        if (primeNum) {
            System.out.println(" yes, this is a prime number: " );
        }else {
            System.out.println(" NO , this is not a prime number: " );
        }       
    }

    public static boolean primeNumber(int value){
        int i = 2; 
        if (value <= 0 ){
            return false;
        }else {
            while(i < value){
            if (value % i == 0){
                return false;
            }
            i++;
        }
        }
        return true ;
    }
}
