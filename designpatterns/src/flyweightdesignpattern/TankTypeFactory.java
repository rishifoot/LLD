package flyweightdesignpattern;

import java.util.HashMap;
import java.util.Map;

public  class TankTypeFactory {
	static Map<String,TankType> map=new HashMap();
	
	public static TankType getTankType(String type) {
		TankType res=null;
		if(map.containsKey(type)) {
			res=map.get(type);
		}
		else {	 
		switch(type) {
		case "typeA":
			res=new TankType("typeA",10,20,null);
			break;
		case "typeB":
			res=new TankType("typeB",10,20,null);
			break;
		case "typeC":
			res=new TankType("typeC",10,20,null);
			break;
		default:
			break;
		}
		map.put(type, res);
		}
		return res;
	}

}
