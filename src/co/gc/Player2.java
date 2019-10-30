package co.gc;

public class Player2 extends Player {

	public Player2() {
		// TODO Auto-generated constructor stub
	}

	private String name = "Rocky Balboa";
	private Roshambo r2;
	
	public Roshambo getRoshambo()
	{
		return r2;
	}
	@Override
	Roshambo generateRoshambo() {
		int choices = (int)(Math.random()*3);
		
		switch (choices) {
		case 0:
			return Roshambo.rock;
			
		case 1:
			return Roshambo.paper;
			
		case 2:
			return Roshambo.scissors;
		}
		return null;
	}

	@Override
	public String toString() {
		return name + " chose " + r2 + "!";
	}

	@Override
	String getName() {
		
		return name;
	}

	@Override
	void setRoshambo(Roshambo r2) {
		this.r2 = r2;
	}
	

}
