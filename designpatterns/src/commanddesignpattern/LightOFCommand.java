package commanddesignpattern;

public class LightOFCommand extends Command {
	Light light;
	
	public LightOFCommand(Light light) {
		this.light=light;
		
	}

	@Override
	void execute() {
		light.lightOff();
		// TODO Auto-generated method stub
		
	}

	@Override
	void undo() {
		light.lightOn();
		// TODO Auto-generated method stub
		
	}

}
