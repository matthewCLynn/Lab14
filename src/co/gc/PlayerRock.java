package co.gc;

public class PlayerRock extends Player {
	public String name = "Rando Calrissian";
	private Roshambo r2;
	
	public PlayerRock() {
		
		// TODO Auto-generated constructor stub
	}
	
	public String getName()
	{
		return name;
	}

	@Override
	Roshambo generateRoshambo() {
		
		return Roshambo.rock;
	}

	@Override
	public String toString() {
		return name + " chose " + r2 + "!";
	}

	@Override
	void setRoshambo(Roshambo r2) {
		this.r2 = r2;
		
	}

	@Override
	Roshambo getRoshambo() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
