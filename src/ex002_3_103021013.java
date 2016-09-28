import java.util.Scanner;

public class ex002_3_103021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		double i;
		System.out.print("輸入通話時間");
		i = scn.nextInt();

		if (i < 601) 
		{
			i = 0.5 * i;
			}
		else if (i <= 1200) {
				i = 0.9 * i;
			}
		else
			i = 0.79*i;
				System.out.println(i);
	}
}