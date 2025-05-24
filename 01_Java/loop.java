import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        // int num = 1;
        // while(num <= 5) {
        //     System.out.println("num" + num);
        //     num = num + 1;
        // }
        
        System.out.println(" enter the number ");
        int i = 0 ;
        while (i< 5) {
            int inp = input.nextInt();
            System.out.println("given number is : " + inp);
            i = i+ 1 ;
        }
    }
}