package statedesignpattern;

public class RadioState extends AudioPlayerState{

	@Override
	public void pressPlay(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Changing Station");
		
	}

	@Override
	public void PressSourceChange(AudioPlayer pl) {
		// TODO Auto-generated method stub
		System.out.println("Setting source to mp3");
		pl.state=new Mp3PauseState();
		
	}

}
