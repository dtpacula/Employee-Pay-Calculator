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
public  class CommissionEmployee extends Employee
{
	double sales;
	double rate;
	
	public CommissionEmployee (String fn, String ln, char g, char m, int empNum, boolean ft)
	{
		super(fn, ln, g, m, empNum, ft);
		sales = 0.0;
		
	}
	
	
	// Prints String
	@Override
	public String toString()
	{
		return String.format("%s\n%s,%s\n%s\nRate: %s\n Sales: %s  ", getEmployeeNumber(), lastName, firstName, middleInital, gender(), rate, sales);

	}
	
	// Calculates Weekly Pay
	@Override
	public double calculateWeeklyPay()
	{
		return rate = sales * rate;
	}
	
	// Gives annual raise
	@Override
	public void annualRaises()
	{
		rate = rate + .02;
	}
	
	// Gives zero holiday bonus
	@Override
	public double holidayBonus()
	{
		return 0;
	}
	
	
	// Resets the week
	@Override
	public void resetWeek()
	{
		sales = 0.0;
	}
	
	
	
}
