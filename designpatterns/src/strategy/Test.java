package strategy;

import strategy.kick.NoKick;
import strategy.kick.SideKick;
import strategy.punch.HookPunch;
import strategy.punch.NoPunch;
import strategy.wrestle.NoWrestle;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fighter f=new Fighter();
		f.kb=new SideKick();
		f.pb=new HookPunch();
		f.wb=new NoWrestle();
		f.fight();

	}

}
