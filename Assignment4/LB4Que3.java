import java.util.Scanner;
class LB4Que3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), fact=1;
        for(int i=1;i<=n;i++) fact*=i;
        System.out.println("Factorial of "+n+" is "+fact);
    }
}
