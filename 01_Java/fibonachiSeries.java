import java.util.Scanner;

public class fibonachiSeries {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("=== Fibonaci Series === ");
        System.out.print("Enter the digit : ");
        int num = input.nextInt();

        System.out.println(" Here your fibonaci series : ");
        fibonaci(num);

    }

    public static void fibonaci(int value){
        if (value < 0 ) return ; 
        System.out.print("0 ");
        if (value == 0) return;
        System.out.print("1 ");
        
        int first = 0 , second = 1 ;
        while(first + second  <= value){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }

    }
}
