package DadosFuncionarioAula70;

import java.util.Scanner;

public class MainDadosFuncionarioAula70 {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		DadosFuncionarioAula70 funcionary = new DadosFuncionarioAula70();
		
		System.out.println("Insery dates of funcionary: ");
		System.out.println("Name: ");
		funcionary.nameAula70 = sc.nextLine();
		System.out.println("Gross Salary: ");
		funcionary.grossSalaryAula70 = sc.nextDouble();
		System.out.println("Tax: ");
		funcionary.taxAula70 = sc.nextDouble();
		
		System.out.println(funcionary);
		
		System.out.println("Increase porcentage salary of the funcionary: ");
		funcionary.newSalaryAula70 = sc.nextDouble();
		System.out.println("New Salary: " + funcionary.newSalaryAula70);
		
		
		sc.close();
	}

}
