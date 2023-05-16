package observor;

public class ScoreCardDisplay implements Observor {

	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		display((CricketData)s);
		
	}
	public void display(CricketData d) {
		System.out.println("score card display -------------");
		System.out.println("Runs " +d.getRuns()+ "overs "+ d.getOvers()+ "wickets " +d.getWickets());
		
	}

}
