package co.gc;

public enum Roshambo {
 rock, paper, scissors;
	
@Override	
	public String toString()
	{
		switch (this) {
		case rock:
			return "rock";
			
		case paper:
			return "paper";
		case scissors:
			return "scissors";
		}
		return null;
	}
	
	
	
}
