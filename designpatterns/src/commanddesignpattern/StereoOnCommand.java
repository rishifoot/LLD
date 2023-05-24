package commanddesignpattern;

public class StereoOnCommand extends Command{
	Stereo stereo;
	public StereoOnCommand(Stereo stereo) {
		this.stereo=stereo;
	}

	@Override
	void execute() {
		stereo.stereoOn();
		// TODO Auto-generated method stub
		
	}

	@Override
	void undo() {
		stereo.stereoOff();
		// TODO Auto-generated method stub
		
	}

}
