package urgey;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		
		add b = new add();
		subtract a = new subtract();
		multiplication c = new multiplication();
		division d = new division();
		
		System.out.println("Calculator");
		System.out.println("Add? Type a");
		System.out.println("Subtract? Type s");
		System.out.println("Multiply? Type m");
		System.out.println("Divide? Type d");
		String option = input.nextLine();
		if(option.equals("a") || option.equals("s") || option.equals("m") || option.equals("d"))
		{
		System.out.println("Input values");
		
		int n1 = input.nextInt();
		int n2 = input.nextInt();
		
		
		//Add
		if(option.equals("a")){
			System.out.println(b.getAdd(n1, n2));
		}
		//Subtract
		if(option.equals("s")){
			System.out.println(a.getSubtract(n1, n2));
		}
		//Divide
		if(option.equals("d")){
			System.out.println(d.getDivide(n1, n2));
		}
		//Multiply
		if(option.equals("m")){
			System.out.println(c.getMult(n1, n2));
		}
		}
		else{
			System.out.println("Not a valid input!");
		}
		}
	}
