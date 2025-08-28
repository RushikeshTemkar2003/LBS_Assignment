import java.util.Scanner;
class LB4Que25 {
   public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s=sc.next().toLowerCase();
	int count=0;
	for(char c:s.toCharArray()) if("aeiou".indexOf(c)>=0) count++;
	System.out.println("The number of vowels in '"+s+"' is: "+count);
    }
}
