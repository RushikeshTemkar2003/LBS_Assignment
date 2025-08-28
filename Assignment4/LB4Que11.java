import java.util.Scanner;
class LB4Que11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[6], pos=0, neg=0;
        for(int i=0;i<6;i++) arr[i]=sc.nextInt();
        for(int x:arr){ if(x>0) pos++; else if(x<0) neg++; }
        System.out.println("Positive numbers: "+pos);
        System.out.println("Negative numbers: "+neg);
    }
}
