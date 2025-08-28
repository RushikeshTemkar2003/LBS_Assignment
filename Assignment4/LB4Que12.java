import java.util.*;
class LB4Que12 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<5;i++) arr[i]=sc.nextInt();
	Arrays.sort(arr);
	System.out.print("Sorted array: ");
	for(int x:arr) System.out.print(x+" ");
    }
}
