import java.util.Scanner ;

class LB3Que7 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in) ;
        int ch ;
	do {
		System.out.println("\n--- MENU ---") ;
		System.out.println("1. Grade Evaluation") ;
		System.out.println("2. Leap Year Check") ;
		System.out.println("3. Day of Week") ;
		System.out.println("4. Default Values") ;
		System.out.println("5. Exit") ;
		System.out.print("Enter choice: ") ;
		ch = sc.nextInt() ;

	switch(ch) {
		case 1:
			int maths=80, science=85, history=90 ;
			double avg = (maths+science+history)/3.0 ;
			System.out.println("Average Marks: "+avg) ;
			if(avg >=90) System.out.println("Grade: A") ;
			else if(avg>=70) System.out.println("Grade: B") ;
			else if(avg>=50) System.out.println("Grade: C") ;
			else if(avg>=30) System.out.println("Grade: D") ;
			else System.out.println("Fail") ;
			break ;

		case 2:
			System.out.print("Enter year: ") ;
			int y = sc.nextInt() ;
			if(y%400==0 || (y%4==0 && y%100!=0)) 
				System.out.println(y+" is a leap year.") ;
			else 
				System.out.println(y+" is not a leap year.") ;
			break ;

		case 3:
			System.out.print("Enter day number (1-7): ") ;
			int d = sc.nextInt() ;
			switch(d) {
				case 1: System.out.println("Monday") ; break ;
				case 2: System.out.println("Tuesday") ; break ;
				case 3: System.out.println("Wednesday") ; break ;
				case 4: System.out.println("Thursday") ; break ;
				case 5: System.out.println("Friday") ; break ;
				case 6: System.out.println("Saturday") ; break ;
				case 7: System.out.println("Sunday") ; break ;
				default: System.out.println("Invalid") ;
			}
			break ;

		case 4:
			byte a=0 ; short b=0 ; int c=0 ; long l=0 ;
			float f=0.0f ; double dd=0.0 ; char g='-' ;
			boolean h=false ;
			System.out.println("byte="+a) ;
			System.out.println("short="+b) ;
			System.out.println("int="+c) ;
			System.out.println("long="+l) ;
			System.out.println("float="+f) ;
			System.out.println("double="+dd) ;
			System.out.println("char="+g) ;
			System.out.println("boolean="+h) ;
			break ;

		case 5:
			System.out.println("Exiting...") ;
			break ;
		default:
			System.out.println("Invalid choice") ;
		}
	} while(ch!=5) ;
    }
}
