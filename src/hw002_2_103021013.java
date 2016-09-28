import java.util.Scanner;

public class hw002_2_103021013 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int i,j;
		System.out.print("輸入身高");
		i = scn.nextInt();
		System.out.print("輸入性別(1代表男性；2代表女性)");
		j = scn.nextInt();
		if(j==2)
		{
			System.out.println((i - 70 )*0.6);
		}
		else
		{
			System.out.println((i - 80 )*0.7);
		}
	}
}