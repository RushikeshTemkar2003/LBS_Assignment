import java.util.Scanner;
class LB4Que10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5], sum=0;
        for(int i=0;i<5;i++) arr[i]=sc.nextInt();
        for(int x:arr) sum+=x;
        System.out.println("The average of the numbers is: "+(sum/5.0));
    }
}
