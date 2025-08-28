import java.util.Scanner ;

class LB3Que1 {
   static int sumOfTwoNumbers(int a , int b) {
       return a+b ;
   }
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in) ;
       System.out.print("Enter first number: ") ;
       int x = sc.nextInt() ;
       System.out.print("Enter second number: ") ;
       int y = sc.nextInt() ;

       int ans = sumOfTwoNumbers(x,y) ;
       System.out.println("The sum of "+x+" and "+y+" is "+ans) ;
    }
}
