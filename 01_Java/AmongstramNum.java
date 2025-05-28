import java.util.Scanner;

public class AmongstramNum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = input.nextInt();

        boolean isAmonst = annostNum(num);
        if(isAmonst){
            System.out.println("your number is Armstrong :  ");
        }else {
            System.out.println("your num is not Amonstrong ");
        }
    }

    public static  boolean annostNum( int value){
        int noOfdigits = noOfDigit(value);
        int finalNum = 0;
        int valueCopy  = value;
        while(value > 0) {
            int lastDigit = value % 10;
            value /= 10;
            finalNum += pow(lastDigit, noOfdigits);
        }
        return finalNum == valueCopy;
    }
    public static int pow(int num1 , int num2) {
        int result  = 1; 
        int i = 0;
        while(i< num2) {
            result *= num1;
            i++;
        }
        return result;
    }
    public static int noOfDigit(int num){
        int digit  = 0;
        while(num > 0 ){
            digit ++; 
            num /= 10;
        }
        return digit;
    }
}