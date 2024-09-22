import DatosTrabajadores.SalesManager;
import DatosTrabajadores.SalesRep;

public class Main {
	
	public static void main(String[] Args) {
		SalesManager manager = new SalesManager("Kristopher", "Jaramillo", 100, 22, 555, 20, 999.99, 2, 123.45);
		SalesRep rep1 = new SalesRep("Libertad", "Rivas", 299, 30.);
		SalesRep rep2 = new SalesRep("Anakin", "Skywalker", 150, 20);
		
		System.out.println(manager);
		System.out.println("Tiempo para retirarse " + manager.timeToRetirement() + " años");
		System.out.println("Todavía de quedan " + manager.vacationTimeLeft() + " días de vacaciones!!!");
		System.out.println("toma tu bonus de " + manager.calculateBonus());
		System.out.println("Comision de " + manager.calculateComission());
		manager.addSalesTeam(rep1);
		manager.addSalesTeam(rep2);
		System.out.println("Comision de " + manager.calculateComission());
		System.out.println("comision de " + rep1.calculateComission());
		System.out.println("comision de " + rep2.calculateComission());	
	}
	
}