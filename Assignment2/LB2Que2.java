class LB2Que2 {
    public static void main(String args[]) {
       int year1 = 2024 ;
       int year2 = 1900 ;

       checkLeap(year1) ;
       checkLeap(year2) ;
    }

    static void checkLeap(int year) {
       if( (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0) ) {
           System.out.println(year + " is a leap year.") ;
       }
       else {
		  System.out.println(year + " is not a leap year.") ;
	   }
    }
}
