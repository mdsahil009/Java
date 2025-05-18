import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Simple interest calculater \n \n ");

        System.out.print("Enter Principle Amount : ");
        float p = input.nextFloat();

        System.out.print("Enter Rate : ");
        float r = input.nextFloat();

        System.out.print("Entre the Time Period in terms of year : ");
        float t = input.nextFloat();

        float Interest = (p*r*t)/100;
        System.out.print("Your interest is : " + Interest);
    }
    
}
