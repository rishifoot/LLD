package strategy.kick;

public class NoKick implements IkickingBehaviour{

	@Override
	public void kick() {
		System.out.println(" doesn't kick");
		
	}

}
