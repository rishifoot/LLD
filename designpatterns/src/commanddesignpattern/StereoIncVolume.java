package commanddesignpattern;

public class StereoIncVolume extends Command {
	Stereo stereo;
	public StereoIncVolume(Stereo stereo) {
		this.stereo=stereo;
	}
	@Override
	void execute() {
		stereo.increaseVolume(1);
		// TODO Auto-generated method stub
		
	}
	@Override
	void undo() {
		stereo.decreaseVolume(1);
		// TODO Auto-generated method stub
		
	}

}
