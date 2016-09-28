import java.util.Scanner;

public class hw002_3_103021013
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int i;
		System.out.print("輸入四位數字(西元年)");
		i = scn.nextInt();
		if(i%400==0)
		{
			System.out.println(i+"為閏年");
		}
		else if((i%4==0)&&(i%100!=0))
		{
			System.out.println(i+"為閏年");
		}
		else
		{
			System.out.println(i+"為平年");
		}
	}
}