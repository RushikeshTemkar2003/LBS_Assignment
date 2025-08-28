import java.util.Scanner ;
class LB3Que6{
    static int calculateSum(int n) {
        int sum=0 ;
        for(int i=1 ; i<=n ; i++) {
            sum += i ;
        }
        return sum ;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter a number: ") ;
        int N = sc.nextInt() ;
        int res = calculateSum(N) ;
        System.out.println("The sum of numbers from 1 to "+N+" is: "+res) ;
    }
}
