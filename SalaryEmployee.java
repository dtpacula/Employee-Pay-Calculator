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
public class SalaryEmployee extends Employee
{
	double salary;
	
	public SalaryEmployee (String fn, String ln, char g, char m, int empNum, boolean ft )
	{
		super(fn, ln, g, m, empNum, ft);
	}
	
	// Formats String Method
	@Override
	public String toString()
	{
		
		return String.format("%s\n %s,%s,%s\nGender:%s\n %s ", getEmployeeNumber(), lastName, firstName, middleInital,  gender(),salary);
		
	}
	
	// figures out WeeklyPay
	@Override
	public double calculateWeeklyPay()
	{
		return salary / 52;
	}
	
	// Applies Annual Raise
	@Override
	public void annualRaises()
	{
		salary = salary + salary * .06;
	}
	
	// Gives Holliday Bonus
	@Override
	public double holidayBonus()
	{
		return salary * .03;
	}
	
	@Override
	public void resetWeek()
	{
		
	}
	
	
	

}
