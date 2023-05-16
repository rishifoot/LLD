package strategy;

import strategy.kick.IkickingBehaviour;
import strategy.punch.IpunchingBehaviour;
import strategy.wrestle.IwrestlingBehaviour;

public class Fighter {
	IkickingBehaviour kb;
	IpunchingBehaviour pb;
	IwrestlingBehaviour wb;
	
	void fight() {
		kb.kick();
		pb.punch();
		wb.wrestle();
	}

}
