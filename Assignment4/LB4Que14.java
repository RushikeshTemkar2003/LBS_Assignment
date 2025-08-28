import java.util.*;
class LB4Que14 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	for(int i=0;i<5;i++) arr[i]=sc.nextInt();
	Arrays.sort(arr);
	int num=sc.nextInt();
	int idx=Arrays.binarySearch(arr,num);
	if(idx>=0) System.out.println("The number "+num+" is found at index "+idx);
	else System.out.println("Not Found");
    }
}
