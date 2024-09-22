package DatosTrabajadores;

import java.util.HashMap;

public class SalesManager extends SalesRep {
	
	private HashMap<Integer, SalesRep> salesTeam  = new HashMap<>();;

	public SalesManager(String firstName, String lastName, int registration, int age, int daysWorked,
			int vacationDaysTaken, double salary, int yearsWorked, double salesMade) {
		super(firstName, lastName, registration, age, daysWorked, vacationDaysTaken, salary, yearsWorked, salesMade);
	}

	public void addSalesTeam(SalesRep salesTeam) {
		this.salesTeam.put(salesTeam.getRegistration(), salesTeam);
	}
	
	@Override
	public double calculateComission() {
		double totalSales = 0;
		if(salesTeam.isEmpty()) {
			System.out.println("No hubo ventas");
			return 0;
		}
		for (SalesRep salesRep : salesTeam.values()) {
			totalSales += salesRep.getSalesMade();
		}
		totalSales += this.getSalesMade();
		totalSales *= 0.03;
		return totalSales;
	}

}

