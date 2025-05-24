import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
        System.out.println("Adding number by return function ");


        int firstNum = readnumber();
        int SecNum = readnumber();

        int sum = firstNum + SecNum; 
        System.out.println("Sum is : " + sum );

    }

        public static int readnumber(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the number: ");
            int number  = input.nextInt();
            return number;
        }   
}
