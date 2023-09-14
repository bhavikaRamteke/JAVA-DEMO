package java_Basics;
import java.util.Scanner;
public class InputInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//one word without space
		System.out.print("Enter Name : ");
		String name = scan.next();
		
		//Only one character
		System.out.print("Enter Gender : ");
		char gender = scan.next().charAt(0);
		
		
		System.out.print("Enter age : ");
		int age = scan.nextInt();
		
		System.out.print("Enter phone Number : ");
		long phno = scan.nextLong();
		
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
		System.out.println("Age : "+age);
		System.out.println("Phone Number : "+phno);
		

	}

}
