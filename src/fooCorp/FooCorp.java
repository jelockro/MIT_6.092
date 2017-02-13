package fooCorp;

public class FooCorp {
	
	
	public static double totalPay(Employee employee){
		
		if (employee.hours <= 40){
			
			return employee.wage * employee.hours;
					
		} else if (employee.hours > 40) {
			
			double notOver = employee.wage * 40;
			int overHours = employee.hours - 40;
			System.out.println("OverHours: " + overHours);
			double overWage = (employee.wage * 1.5);
			System.out.println("New Over Wage: " + overWage);
			double overWages = (employee.wage * 1.5) * overHours;
			System.out.println("Overwages: " + overWages);
			return notOver + overWages;
			
			
		}
		else {
		return 0;
		}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee(7.50, 35);
		Employee emp2 = new Employee(8.20, 47);
		System.out.println("Total Pay: " + FooCorp.totalPay(emp1));
		System.out.println("Total Pay: " + FooCorp.totalPay(emp2));

}
}
