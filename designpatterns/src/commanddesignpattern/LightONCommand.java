package commanddesignpattern;

public class LightONCommand extends Command {
	Light light;
	public LightONCommand(Light light) {
		this.light=light;
	}

	@Override
	void execute() {
		light.lightOn();
		// TODO Auto-generated method stub
		
	}

	@Override
	void undo() {
		light.lightOff();
		// TODO Auto-generated method stub
		
	}

}
