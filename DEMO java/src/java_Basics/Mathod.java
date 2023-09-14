package java_Basics;
import java.util.Scanner;
class calculator
{
	int num1,num2;
	calculator(int a,int b)
	{
		num1 = a;
		num2 = b;
	}
	public void Add()
	{
		System.out.println( num1 + num2);
	}
	public void Sub()
	{
		System.out.println(num1-num2);
	}
	public void Mul()
	{
		System.out.println(num1*num2);
	}
	public void Divide()
	{
		System.out.println(num1/num2);
	}
}
public class Mathod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter any two number");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println("Enter any opration you want to perform:- +/-/x/%");
		char oprator = scan.next().charAt(0);
		
		calculator obj = new calculator(num1,num2);
		if(oprator == '+')
		{
			obj.Add();
		}
		else if(oprator == '-')
		{
			obj.Sub();
		}
		else if(oprator == 'x')
		{
			obj.Mul();
		}
		else if(oprator == '%')
		{
			obj.Divide();
		}
		
	}

}
