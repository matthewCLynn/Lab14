package co.gc;

import java.util.Scanner;

public class RoshamboApp
{
//	static int win=0;
//	static int loss=0;
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		String cont = "y";
		System.out.println("Welcom to Rock Paper Scissors!");
		Roshambo r1;
		Roshambo r2;
		
		PC player = new PC(Validator.getString(scan, "Enter your name: "));
		Player rock;
		while (cont.equalsIgnoreCase("y"))
		{
			System.out.println("Would you like to play against Rando Calrissian or Rocky Balboa ?");
			int choice = Validator.getInt(scan, "\n1. Rando Calrissian\n2. Rocky Balboa\n\nEnter your choice: ", 1, 2);
			String rpsChoice = 
			Validator.getStringMatchingRegex(scan,"Rock, Paper, or Scissors(R/P/S): ","[RrPpSs]").toLowerCase();
			player.generateRoshambo(rpsChoice);
			r1=player.generateRoshambo(rpsChoice);
			player.setRoshambo(r1);
			if(choice == 1)
			{
				rock = new PlayerRock();
				r2=rock.generateRoshambo();
				rock.setRoshambo(r2);
			}
			else
			{
				rock = new Player2();
				r2=rock.generateRoshambo();
				rock.setRoshambo(r2);
			}
			
			System.out.println(player);
			System.out.println(rock);
			System.out.println(runIt(r1,r2,player.getName(),rock.getName()));
			//System.out.println("Wins: " + win + "\nLosses: " + loss);
		}
		System.out.println("Goodbye!");
		scan.close();
	}
	
	public static String runIt(Roshambo p1, Roshambo npc, String namePC, String nameRock)
	{
		System.out.println();
		if(p1.equals(npc))
		{
			return "Draw!";
		}
		else if(((p1.toString().equals("rock")) && npc.toString().equals("scissors")) || ((p1.toString().equals("paper")) && npc.toString().equals("rock")) || ((p1.toString().equals("scissors")) && npc.toString().equals("paper")))
		{
		//	win++;
			return namePC + " wins!";
		}
		
		else
		{
		//	loss++;
			return nameRock + " wins!";
		}
	}

}
