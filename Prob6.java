import java.util.Scanner;
public class Prob6{
	public static void main(String []args){
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value for base");
		int base =scanner.nextInt();
		System.out.println("Enter value for exponent");
		int exponent =scanner.nextInt();
		double result=Math.pow(base,exponent); 
		System.out.println(base+" raise to power "+ exponent +" is equal to:"+ result); 
		
	}
}