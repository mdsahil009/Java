public class parameters {
   public static void main(String[] args) {
    System.out.println("Calculating Sum by parameters : ");
    int num = sumTwoNumbers(45, 12);
    // int num2 = sumTwoNumbers(45, 75);

    System.out.println("Sum is : " + num);
    System.out.println(sumTwoNumbers(45, 75));

   }
   
   public static int sumTwoNumbers(int first, int second){
    System.out.println("First number is : " + first);
    System.out.println("Second number is : " + second);

//    int sum = first + second; 
   return first + second;
//    return sum ; 

   }
}
