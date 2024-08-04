public class Prob7{
	public static void main(String []args)
	{
		int number =12345;
		int digit1=number%10;
		int digit2=(number/10)%10;
		int digit3=(number/100)%10;
		int digit4=(number/1000)%10;
		int digit5=(number/10000)%10;
		int sum=digit1+digit2+digit3+digit4+digit5;
		System.out.print("sum of 12345 is :"+ sum);
		
	}
}