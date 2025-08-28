import java.util.*;
class LB4Que13 {
    public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Integer arr[]=new Integer[5];
	for(int i=0;i<5;i++) arr[i]=sc.nextInt();
	int num=sc.nextInt();
	if(Arrays.asList(arr).contains(num)) System.out.println("Found");
	else System.out.println("Not Found");
    }
}
