import java.util.Scanner;

public class hw002_1_103021013 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N,f;
		int a1,a2,a3;
		System.out.print("��J����");
		N = scn.nextInt();
		System.out.print("��Ja1,a2,a3");
		a1 = scn.nextInt();
		a2 = scn.nextInt();
		a3 = scn.nextInt();
		if(a1*15+ a2*20+ a3*30<=N)
		{
			f=N-(a1*15+ a2*20+ a3*30);
			System.out.println(f%10+"��1����");
			System.out.println(f/5+"��5����");
			System.out.println(f/50+"��50��");
			}
		else
		{
		System.out.println(0);
	}
}
}