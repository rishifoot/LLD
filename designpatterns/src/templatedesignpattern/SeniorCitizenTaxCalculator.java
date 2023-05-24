package templatedesignpattern;

public class SeniorCitizenTaxCalculator extends TaxCalculator{

	@Override
	public int applyStandardDedecution(int income) {
		
		return income-100000;
	}

	@Override
	public int applyTaxRate(int income) {
		
		return (int)(income*0.1);
	}

	@Override
	public int applySurcharge(int tax) {
		
		return (int)(tax*1.00);
	}

}
