package statedesignpattern;

public class StandByState extends AudioPlayerState{

	@Override
	public void pressPlay(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Invalid operation");
		
	}

	@Override
	public void PressSourceChange(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Setting source to radio");
		pl.state=new RadioState();
		
	}

}
