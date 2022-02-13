package entities;

public class Company extends TaxPayer {

	private int numberOfEmpployees;
	
	public Company() {
	}
	public Company(String name, Double anualIncome, int numberOfEmpployees) {
		super(name, anualIncome);
		this.numberOfEmpployees = numberOfEmpployees;
	}
	public int getNumberOfEmpployees() {
		return numberOfEmpployees;
	}
	public void setNumberOfEmpployees(int numberOfEmpployees) {
		this.numberOfEmpployees = numberOfEmpployees;
	}

	@Override
	public Double tax() {
		if (numberOfEmpployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}

}
