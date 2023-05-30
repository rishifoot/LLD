package observor;

public class CricketData extends Subject {
	private int runs;
	private int wickets;
	private int overs;
	public int getRuns() {
		return runs;
	}
	public void setRuns(int runs) {
		this.runs = runs;
	}
	public int getWickets() {
		return wickets;
	}
	public void setWickets(int wickets) {
		this.wickets = wickets;
	}
	public int getOvers() {
		return overs;
	}
	public void setOvers(int overs) {
		this.overs = overs;
	}
	
	public void setData(int runs,int overs,int wickets) {
		
		setRuns(runs);
		setOvers(overs);
		setWickets(wickets);
		super.notifys();
	}

}
