package observor;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CricketData cd=new CricketData();
		cd.setData(50, 10, 1);
		ScoreCardDisplay sd=new ScoreCardDisplay();
		NetRunRateDisplay nt=new NetRunRateDisplay();
		FinalScoreDisplay fd=new FinalScoreDisplay();
		cd.register(sd);
		cd.register(nt);
		cd.register(fd);
		cd.setData(100, 20, 2);
		cd.setData(150, 30, 3);
		cd.unRegister(fd);
		cd.setData(200, 40, 4);
		

	}

}
