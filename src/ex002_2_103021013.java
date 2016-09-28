import java.util.Scanner;
public class ex002_2_103021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int i,j;
	    System.out.print("請輸入座標位置");
	    i = scn.nextInt();
	    j = scn.nextInt();
	    if (i < 100&&j<100)
	    {
	    	System.out.println("在範圍內");
	    	}
	    	else
	    		System.out.println("在範圍外");
	    		

	}

}