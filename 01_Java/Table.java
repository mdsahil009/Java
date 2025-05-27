import java.util.Scanner;

public class Table {

    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);

        System.out.println(" ====Table==== ");
        System.out.print("Enter the  Number for Table : ");
        int num = input.nextInt();
        multiplication(num);
    }

    public static void multiplication(int num) {
        int i = 1; 
        while(i <= 10) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    } 
}