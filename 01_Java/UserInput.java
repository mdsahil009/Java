import java.util.Scanner;

public class UserInput {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Hello " + name);
        // Scanner age = new Scanner(System.in);
        System.out.print(name + " , Also enter your age : ");
        int age = input.nextInt();
        System.out.println(name + ", Your age is : " + age);
    }
}