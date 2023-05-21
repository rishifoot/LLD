package statedesignpattern;

public class Mp3PauseState extends AudioPlayerState{

	@Override
	public void pressPlay(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("playing state");
		pl.state=new Mp3PlayingState();
		
	}

	@Override
	public void PressSourceChange(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Setting to radio state");
		pl.state=new RadioState();
		
	}

}
