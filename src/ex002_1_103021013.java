import java.util.Scanner;
public class ex002_1_103021013 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
	    int i;
	    System.out.print("�п�J�ɶ� /����");
	    i = scn.nextInt();
	    if (i < 120)
	    {
	    	i=(i/30)*30;
	    }
	    else if (i < 240) 
	    {
	    	i=(((i-120)/30)*40)+120;
	    	}
	    else
	    {
	    	i=(((i-240)/30)*60)+280;
	    }
	    System.out.println(i);
	    }
	}
