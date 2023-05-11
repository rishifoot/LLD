package adapterdesignpattern;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeDetails es=new EmployeeDetails();
		EmployeeToIntranetAdapter adapter=new EmployeeToIntranetAdapter(es);
		Intranet intr=new Intranet(adapter);
		intr.printPhoneNumbers();

	}

}
