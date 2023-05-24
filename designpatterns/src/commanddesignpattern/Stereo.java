package commanddesignpattern;

public class Stereo {
	public int volume=5;
	public void stereoOn() {
		System.out.println("Turned on the stereo");
	}
	public void stereoOff() {
		System.out.println("Turned off the stereo");
	}
	public void decreaseVolume(int del) {
		volume-=del;
		System.out.println("Decreased vol to "+volume);
		
	}
	public void increaseVolume(int del) {
		volume+=del;
		System.out.println("Increased vol to "+volume);
		
	}

}
