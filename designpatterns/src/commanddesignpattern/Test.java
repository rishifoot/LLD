package commanddesignpattern;

public class Test {

	public static void main(String[] args) {
		RemoteControl rc=new RemoteControl();
		Light light=new Light();
		Stereo stereo=new Stereo();
		rc.b1command=new LightONCommand(light);
		rc.b2command=new LightOFCommand(light);
		rc.b3command=new StereoDecVolume(stereo);
		rc.b4command=new StereoIncVolume(stereo);
		
		rc.btn1();
		rc.btn2();
		rc.btn3();
		rc.btn4();
		rc.b1command=new StereoOnCommand(stereo);
		rc.btn4();
		
	

	}

}
