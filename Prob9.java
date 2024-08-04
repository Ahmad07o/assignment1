import java.util.Scanner;
public class Prob9{
	public static void main(String[]args)
	{
		Scanner obj=new Scanner(System.in);
		int amount=obj.nextInt();
		int hundred=amount/100;
		amount=amount-hundred*100;
		int fifty=amount/50;
		amount=amount-fifty*50;
		int ten=amount/10;
		System.out.println("no of hundred notes are:"+ hundred +"\n no of fifty notes:"+ fifty + "\n no of ten notes are :"+ ten);
	}
}