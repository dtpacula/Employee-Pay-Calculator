// Name     : DEREK PACULA
// Class    : 1620-101
// Program #    : 1
//
// Honor Pledge:  On my honor as a student of the University
//                of Nebraska at Omaha, I have neither given nor received
//                unauthorized help on this homework assignment.
//
// NAME: DEREK PACULA
// EMAIL: DEREK.PACULA@GMAIL.COM
//
public class EmployeeManager {
	private Employee[] employees;
	final int employeeMax = 100;
	private int currentEmployees;

	public EmployeeManager() {
		employees = new Employee[employeeMax];
		currentEmployees = 0;
		
	}

	// From the user input, the Method will use the switch statement to point to the direction
	// of the class, and set their salary to the amount
	public void addEmployee(int empType, String fn, String ln, char m, char g,
			int empNum, boolean ft, double amount) {

		Employee emp;

		switch (empType) {
		case 1:
			emp = new HourlyEmployee(fn, ln, m, g, empNum, ft);
			((HourlyEmployee)emp).wage = amount;
			break;
		case 2:
			emp = new SalaryEmployee(fn, ln, m, g, empNum, ft);
			((SalaryEmployee)emp).salary = amount;
			break;
		default:
			emp = new CommissionEmployee(fn, ln, m, g, empNum, ft);
			((CommissionEmployee)emp).rate = amount;
			break;
		}

		employees[currentEmployees] = emp;
		currentEmployees++;
	}

	// Method removes an Employee by employee number
	public void RemoveEmployee(int index) {
		
		for (int x = index; x < currentEmployees -1; x++)
		{
			employees[x] = employees[x+1];
		}
		
		currentEmployees--;
		
	
	}

	// Lists all Employees in the Array
	public void listAll() {
		
		for (int x = 0; x < currentEmployees; x++)
		{
			 System.out.println(employees[x].toString());
		}
		
	}

	// Lists all Employees payed hourly
	public void listHourly() {
		
		for (int x = 0; x < currentEmployees; x++)
		{
			if(employees[x] instanceof CommissionEmployee)
			{
				 System.out.println(employees[x].toString());
			}

		}


	}
	
	// Lists all Employees that are payed by salary
	public void listSalary()
	{
		for (int x = 0; x < currentEmployees; x++)
		{
			if(employees[x] instanceof SalaryEmployee)
			{
				 System.out.println(employees[x].toString());
			}
		}
	
			

	}

	// Lists all Employees that are payed by Commission
	public void listCommission() {

		for (int x = 0; x < currentEmployees; x++)
		{
			if(employees[x] instanceof CommissionEmployee)
			{
				 System.out.println(employees[x].toString());
			}
		}
	}

	// Resets the week of the Employees to Zero
	public void resetWeek() {
		for (int ann = 0; ann < currentEmployees; ann++) 
		{
			employees[ann].resetWeek();
		}

	}

	// Calculates what the employees should be payed
	public double calculatePayout() {
		int total = 0;
		for (int ann = 0; ann < currentEmployees; ann++) 
		{
			total += employees[ann].calculateWeeklyPay();
			System.out.print(employees[ann]+"");
		}
		return total; 
	}
	
	// Removes any Redundancies in the arrays
	public void removeRedundancies() {

		if (currentEmployees > 1) {
			sortNumber();

			for (int i = 0; i < currentEmployees; i++) {
				for (int j = i; j < currentEmployees; j++) {

					if (employees[i].equals(employees[i + 1])) {
						RemoveEmployee(i);
					}
				}
			}
		}

	}

	// Gets the index Number for the array, if none returns -1
	public int getIndex(int empNum) {
		for (int i = 0; i< currentEmployees; i++) {
			if (empNum == employees[i].getEmployeeNumber()) {
			return i;
			}
			}
			return -1;
	}

	// Sorts the employees by Number
	public void sortNumber() {
		if (currentEmployees <= 1) {
			System.out.println("Two or more employees are required to sort.");
			return;
		}
		int sort;
		boolean flag = true;
		Employee temp;
		
		while (flag) {
			flag = false;
			for (sort = 0; sort < currentEmployees-1; sort++) {
				if (employees[sort].getEmployeeNumber() > employees[sort + 1].getEmployeeNumber()) {
					temp = employees[sort];
					employees[sort] = employees[sort + 1];
					employees[sort + 1] = temp;
					flag = true;

				}
			}
		}

	}

	// Sorts the Employees by Name
	public void sortName() {
		if (currentEmployees <= 1) {
			System.out.println("Two or more employees are required to sort.");
			return;
		}
		for (int name = 0; name < currentEmployees-1; name++) {
			for (int sort = name + 1; sort < currentEmployees-1; sort++) {
				if (employees[sort].getLastName().compareTo(employees[name].getLastName()) < 0) {
					String t = employees[name].getLastName();
					employees[name] = employees[sort];
					employees[sort].lastName = t;
				}
			}
		}
	}

	// Applies the annual raises to all the Classes
	public void annualRaises() {
		for (int ann = 0; ann < currentEmployees; ann++) 
		{
			employees[ann].annualRaises();
		}
	}

	// Gives a holiday bonus to the employees that get it
	public double holidayBonuses() {
		int total = 0;
		for (int ann = 0; ann < currentEmployees; ann++) 
		{
			total += employees[ann].holidayBonus();
			System.out.print(employees[ann]+"");
		}
		return total; 
	}

	// Give hours worked to HourlyEmployee
	public void increaseHours(int index, double amountToAdd) {
		if(employees[index] instanceof HourlyEmployee){
			((HourlyEmployee)employees[index]).hoursWorked += amountToAdd;
		}

	}

	// Increases sales rate of CommissionEmployee
	public void increaseSales(int index, double amountToIncrease) {
		if(employees[index] instanceof CommissionEmployee){
			((CommissionEmployee)employees[index]).sales += amountToIncrease;
		}

	}
}
