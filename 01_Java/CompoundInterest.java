import java.util.Scanner;
    
public class CompoundInterest {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Compound interest calculater \n \n ");

        System.out.print("Enter Principle Amount : ");
        float p = input.nextFloat();

        System.out.print("Enter Rate : ");
        float r = input.nextFloat();

        System.out.print("Entre the Time Period in terms of year : ");
        float t = input.nextFloat();

        double Interest = p * Math.pow((1+ r/100), t);
        System.out.print("Your interest is : " + Interest);
    }
    
}


