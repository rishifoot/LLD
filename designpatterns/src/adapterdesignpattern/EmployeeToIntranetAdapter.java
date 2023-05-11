package adapterdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class EmployeeToIntranetAdapter implements IphoneListSource{
	public EmployeeDetails emps;
	public EmployeeToIntranetAdapter( EmployeeDetails ds) {
		this.emps=ds;
	}

	@Override
	public List<String> getPhoneNumbers() {
		List<String> data=this.emps.getEmployees();
		List<String> phones=new ArrayList();
		for(String emp:data) {
			String arr[]=emp.split("-");
			String phone=arr[2];
			phones.add(phone);
		}
		return phones;
	}

}
