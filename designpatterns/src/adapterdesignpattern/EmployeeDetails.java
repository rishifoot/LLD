package adapterdesignpattern;

import java.util.ArrayList;
import java.util.List;

//data provider
public class EmployeeDetails {
	public List<String> getEmployees(){
		List<String> data=new ArrayList();
		data.add("1-SDE1-8024080808");
		data.add("2-SDE1-0350385089");
		return data;
				
	}
	

}
