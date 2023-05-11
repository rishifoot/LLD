package adapterdesignpattern;

import java.util.List;

//data consumer
public class Intranet {
	IphoneListSource source;
	public Intranet(IphoneListSource s) {
		this.source=s;
	}
	
	public void printPhoneNumbers() {
		List<String> phoneNumbers=this.source.getPhoneNumbers();
		System.out.println(phoneNumbers);
		
	}

}
