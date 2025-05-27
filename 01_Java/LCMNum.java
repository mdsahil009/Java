import java.util.Scanner;

public class LCMNum{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" === Find the LCM of number === ");
        System.out.print("Enter the first number : ");
        int first = input.nextInt();
        System.out.print("Enter the second number : ");
        int second = input.nextInt();
        int Lcm = lcm(first, second);
        System.out.println("the LCM of " + first + " and " + second + " is : " + Lcm);

    }

    public static int lcm(int first, int second) {
        int i = 1;
        while(i <= second){
            int fact = first * i ;
            if (fact % second == 0) {
                return fact;
            }
            i++;
        }
        return 0;
    }
}