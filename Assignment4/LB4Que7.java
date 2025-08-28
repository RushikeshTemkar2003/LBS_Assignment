import java.util.Scanner;
class LB4Que7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5], sum=0;
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        for(int x:arr) sum+=x;
        System.out.println("The sum of all numbers is: "+sum);
    }
}
