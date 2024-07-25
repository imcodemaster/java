package Mypackage;

public class typecasting {
	  public static void main(String[] args) {
		    int myInt = 93;
		    double doublevar = myInt; // Automatic narrow casting: int to double
		    short shorts = 6;
		    int intvar = shorts; // Automatic narrow casting: short to int
	 
		    double number = 23.5d;
		    int num = (int) number; // wide casting

		    System.out.println("print as \\int\\ - " + myInt);      // Outputs 9 wide casting 
		    System.out.println("print \'shorts\' as \"int\" - " + intvar);    // output 6 as int wide casting
		    System.out.println("print int \n as \t short - " +doublevar);   // Outputs 9.0 wide casting
		    System.out.println("print double as int - \r " +num);   // Outputs 23 narrow casting manual
		  }
}
