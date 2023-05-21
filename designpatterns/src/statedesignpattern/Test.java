package statedesignpattern;

public class Test {

	public static void main(String[] args) {
		AudioPlayer al=new AudioPlayer();
		al.pressPlay();
		al.pressSourceChange();
		al.pressPlay();
		al.pressSourceChange();
		al.pressPlay();
		al.pressSourceChange();

	}

}
