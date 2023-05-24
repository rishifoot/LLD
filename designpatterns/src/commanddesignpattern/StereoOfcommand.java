package commanddesignpattern;

public class StereoOfcommand extends Command{
	Stereo stereo;
	public StereoOfcommand(Stereo stereo) {
		this.stereo=stereo;
	}

	@Override
	void execute() {
		stereo.stereoOff();
		// TODO Auto-generated method stub
		
	}

	@Override
	void undo() {
		stereo.stereoOn();
		// TODO Auto-generated method stub
		
	}

}
