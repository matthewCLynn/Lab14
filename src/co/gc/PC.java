package co.gc;

public class PC extends Player {

	private String name;
	private String input;
	private Roshambo r2;
	public PC() {
		// TODO Auto-generated constructor stub
	}
	
	public Roshambo getRoshambo()
	{
		return r2;
	}
	
	public PC(String name)
	{
		this.name = name;
	}
	
	@Override
	Roshambo generateRoshambo()
	{
		return null;
	}
	public void setInput(String input)
	{
		this.input = input;
	}
	Roshambo generateRoshambo(String input) {
		// TODO Auto-generated method stub
		setInput(input);
		switch (input) {
		case "r":
			return Roshambo.rock;
		
		case "p":
			return Roshambo.paper;
		case "s":
			return Roshambo.scissors;
		}
		return null;
	}

	@Override
	String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + " chose " + r2 + "!";
	}
	@Override
	void setRoshambo(Roshambo r2) {
		this.r2 = r2;
	}	
}
	
	

