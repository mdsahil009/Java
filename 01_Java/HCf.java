import java.util.Scanner;

public class HCf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" === Find the HCF of number === ");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int HCF = hcf(first, second);
        System.out.println("the HCF of " + first + " and " + second + " is : " + HCF);

    }

    public static int hcf(int num1, int num2) {
        int gcd = 1;
        int i = 2;
        int newleast = least( num1, num2);
        
        while(i <= newleast){
            if ( num1 % i == 0 && num2 % i == 0) {
                gcd = i ;
            }
            i++;
        }
        return gcd;
    }

    public static int least(int num1, int num2){
        if (num1 < num2){
            return num1;
        }else{
            return num2;
        } 
    }
}

