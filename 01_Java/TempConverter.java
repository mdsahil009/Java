import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Temperature Converter From \"F \" to \"C\"  \n \n");

        System.out.print("Enter the temp in F : ");
        float f = input.nextFloat();

        float celc = (f-32) * 5/9;

        System.out.print("Temp in C : " + celc);
    }
}
