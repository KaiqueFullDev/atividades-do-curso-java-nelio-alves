package DadosFuncionarioAula70;

public class DadosFuncionarioAula70 {
	
	public String nameAula70;
	public double grossSalaryAula70;
	public double taxAula70;
	public double incresySalaryAula70;
	public double increasePorcentageAula70;
	public double newSalaryAula70;
	
	public double newSalaryAula70() {
		
		return newSalaryAula70 = grossSalaryAula70 + (increasePorcentageAula70 / 100);
		
	}
	
	public double postTaxSalary() {
		
		return grossSalaryAula70 - taxAula70;
		
	}
	
	public String toString() {
		
		return "Name: " + nameAula70 + "\ngrossSalary: " + grossSalaryAula70 + "\nSalary Post Tax:" + postTaxSalary(); 
		
	}
	
}
