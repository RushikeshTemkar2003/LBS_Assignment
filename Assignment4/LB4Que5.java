import java.util.Scanner;
class LB4Que5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(), sum=0;
        for(int i=1;i<=n;i+=2) sum+=i;
        System.out.println("The sum of odd numbers from 1 to "+n+" is: "+sum);
    }
}
