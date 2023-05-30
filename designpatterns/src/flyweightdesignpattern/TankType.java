package flyweightdesignpattern;

import java.awt.Image;

public class TankType {
	
	String typeName;
	int power;
	int originalHealth;
	Image image;
public TankType(String typeName, int power, int originalHealth, Image image) {
		
		this.typeName = typeName;
		this.power = power;
		this.originalHealth = originalHealth;
		this.image = image;
	}

}
