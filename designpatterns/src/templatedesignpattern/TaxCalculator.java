package templatedesignpattern;

public abstract class TaxCalculator {
	public int calculateTax(int income) {
		income=applyStandardDedecution(income);
		int tax=applyTaxRate(income);
		int taxAfterCharge=applySurcharge(tax);
		return taxAfterCharge;
		
	}
	public abstract int applyStandardDedecution(int income);
	public abstract int applyTaxRate(int income);
	public abstract int applySurcharge(int tax);
	

}
