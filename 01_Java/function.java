public class function {
    public static void main(String[] args) {
        System.out.println("Main Works then call function ");
        greeting();
        System.out.println("then Main also works after calling function ");
        pattern();
    }

    public static void greeting() {
        System.out.println(" Function Calling");
    }

    public static void pattern() {
        System.out.println(" Printing Right angle triangle pattern ");

        int i = 0 ; 
        while (i< 5) {
            System.out.print("*");

            int j = 0 ; 
            while(j< i ) {
                System.out.print(" *");
                j ++;
            }
            System.out.println();
            i ++; 
        }
    }
}
