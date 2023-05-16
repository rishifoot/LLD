package observor;

public class FinalScoreDisplay implements Observor  {

	
	public void display(CricketData d) {
		if(d.getWickets()==0) {
			double nrr=d.getRuns()*1.0/d.getOvers();
			int pfScore=(int)nrr*50;
			System.out.println("Final Score "+ pfScore);
		}
		else {
			double rpw=d.getRuns()*1.0/d.getWickets();
			int pfScore=(int)rpw*10;
			System.out.println("Final Score "+ pfScore);
		}
	}

	@Override
	public void update(Subject s) {
		// TODO Auto-generated method stub
		display((CricketData)s);
		
	}

}
