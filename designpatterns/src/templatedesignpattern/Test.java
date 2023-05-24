package templatedesignpattern;

public class Test {

	public static void main(String[] args) {
		TaxCalculator tc=new SeniorCitizenTaxCalculator();
		System.out.println(tc.calculateTax(1000000));

	}

}
