package commanddesignpattern;

public class StereoDecVolume  extends Command{
	Stereo stereo;
	public StereoDecVolume(Stereo stereo) {
		this.stereo=stereo;
	}

	@Override
	void execute() {
		stereo.decreaseVolume(1);
		// TODO Auto-generated method stub
		
	}

	@Override
	void undo() {
		stereo.increaseVolume(1);
		// TODO Auto-generated method stub
		
	}

}
