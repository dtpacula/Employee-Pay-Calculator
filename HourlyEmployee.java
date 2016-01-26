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
public  class HourlyEmployee extends Employee
{
	double wage;
	double hoursWorked;
	
	
	// sets hoursworked to zero and inhetinaces the class from employee
	public HourlyEmployee (String fn, String ln, char g, char m, int empNum, boolean ft)
	{
		super(fn, ln, g, m, empNum, ft);
		hoursWorked = 0.0;
	}
	
	// Prints String Out
	@Override
	public String toString()
	{
		return String.format("%s\n%s,%s,%s.\nGender: %s\nWage: %s\nHours Worked: %s\n ", getEmployeeNumber(),lastName, firstName, middleInital(), gender(), wage, hoursWorked);
		
	}
	
	// CalculatesWeeklyPay
	@Override
	public double calculateWeeklyPay()
	{
		wage = wage * hoursWorked;
		return wage;
	}
	
	// Gives Holiday Bonus
	@Override
	public double holidayBonus()
	{
		wage = wage * 40.0;
		return wage;
	}
	
	// applies annualRiase
	@Override
	public void annualRaises()
	{
		wage = wage *.05;
	}
	
	// Resets week
	@Override
	public void resetWeek()
	{
		hoursWorked = 0.0; 
	}
	
	
}

