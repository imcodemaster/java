package Mypackage;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "VInay";
		String name2 = "Bhatt";
		String fname = name + " "+ name2;
		System.out.println("print first name and second name - " + name + " "+ name2);
		System.out.println("concatenate name with .concat(method) - " + name.concat(name2));
		System.out.println("print lenght of variable name - " + name.length());
		System.out.println("print lenght of variable name2 - " + name2.length());
		System.out.println("print to uppercase - variable name - " + name.toUpperCase());
		System.out.println("print to uppercase - variable name 2 - " + name2.toUpperCase());
		System.out.println("print fullname in lowercase - " + fname.toLowerCase());
		System.out.println("found index of char in variable declared - " + name2.indexOf("a"));


	}

}
