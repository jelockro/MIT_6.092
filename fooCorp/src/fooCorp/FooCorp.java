package fooCorp;

public class FooCorp {
	
	
	public static double totalPay(Employee employee){
		
		double paycontainer;
		if (employee.wage < 8.00 ){
			
			System.out.println("Error: Employee(" + employee.name + ") wage(" + employee.wage + ") below state minimum.");
			return 0;
		}
		
		else if (employee.hours <= 40){
			
			paycontainer =  employee.wage * employee.hours;
					
		} else if (employee.hours > 60){
			
			System.out.println("Error: Employee(" + employee.name + ") hours(" + employee.hours + ") above state maximum");
			return 0;
		}
		
		
		else {
			
			double notOver = employee.wage * 40;
			int overHours = employee.hours - 40;
			//System.out.println("OverHours: " + overHours);
			double overWage = (employee.wage * 1.5);
			//System.out.println("New Over Wage: " + overWage);
			double overWages = (employee.wage * 1.5) * overHours;
			//System.out.println("Overwages: " + overWages);
			paycontainer = notOver + overWages;
			
			
		}
		
		
		System.out.println(employee.name + "Total Pay:" + Double.toString(paycontainer));
		return paycontainer;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee("emp1", 7.50, 35);
		Employee emp2 = new Employee("emp2", 8.20, 47);
		Employee emp3 = new Employee("emp3", 10.00, 73);
		FooCorp.totalPay(emp1);
		FooCorp.totalPay(emp2);
		FooCorp.totalPay(emp3);

}
}
