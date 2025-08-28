import java.util.Scanner;
class LB4Que26 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.next();
      String rev=new StringBuilder(s).reverse().toString();
      if(s.equals(rev)) System.out.println("The string '"+s+"' is a palindrome.");
      else System.out.println("The string '"+s+"' is not a palindrome.");
    }
}
