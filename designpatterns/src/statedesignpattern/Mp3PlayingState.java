package statedesignpattern;

public class Mp3PlayingState extends AudioPlayerState{

	@Override
	public void pressPlay(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("paused mp3");
		pl.state=new Mp3PauseState();
		
	}

	@Override
	public void PressSourceChange(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Setting to radio1 state");
		pl.state=new RadioState();
		
	}

}
