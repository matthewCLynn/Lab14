package co.gc;

public abstract class Player {

	private String name;
	
	abstract String getName();
	
	public Player()
	{
		super();
	}
	
	public Player(String name) {
		super();
		this.name = name;
	}

	abstract Roshambo generateRoshambo();
	
	abstract void setRoshambo(Roshambo r2);
	
	abstract Roshambo getRoshambo();
	
	//static int choice Roshambo

}
