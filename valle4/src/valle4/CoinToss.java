package valle4;

import java.util.Scanner;

public class CoinToss {

	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		System.out.println("How many times should I toss the coin?");
		int tosses=keyboard.nextInt();
		keyboard.close();
		int heads=0;
		int tails=0;
		String result="";
		for (int i=0;i<tosses;i++) {
			result=headsOrTails();
			if(result.equals("HEADS")) {
				heads+=1;
			}
			else {
				tails+=1;
			}
		}
		System.out.printf("Tosses: %d\tHeads: %d\t Tails:%d", tosses, heads, tails);
		
		
	}
	public static String headsOrTails() {
		int coin=(int)(Math.random()*2);
		if(coin==0)
		{
			return "HEADS";
		}
		else {
			return "TAILS";
		}
	}

}
