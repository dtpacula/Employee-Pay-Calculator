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
import java.util.Scanner;

public abstract class Employee 
{
	protected String firstName;
	protected String lastName;
	protected char middleInital;
	protected boolean fulltime;
	private char gender;
	private int employeeNum;
	
	
	// Calls all the data types, sets their values, and also tests to see if the Employee Numbers are valid, and if The
	// Gender is invalid, it defaults to F
	public Employee (String fn, String ln, char m, char g, int empNum,boolean ft)
	{
		
		firstName = fn;
		lastName = ln;
		middleInital = m;
		fulltime = ft;
		gender = g;
		employeeNum = empNum; 
		Scanner input = new Scanner (System.in);
		while (employeeNum > 99999 || employeeNum < 10000)
		{
			System.out.print("You entered an Invalid employee number earlier, please enter a new employee number: ");
			employeeNum = input.nextInt();
		}
		
		if (g != 'F' || g != 'M')
		{
			gender = 'F';
		}
			
	}
		
	// Returns Employee Number
	public int getEmployeeNumber()
	{
		return employeeNum;
	}
	
	// Sets the Employee Number
	public void setEmployeeNumber(int empNum)
	{
		employeeNum = empNum;
	}
	
	// Returns First Name
	public String getFirstName()
	{
		return firstName;
	}
	
	// Returns the Gender
	public char gender()
	{
		return gender;
	}
	
	// Returns the MiddleIntial
	public char middleInital()
	{
		return middleInital;
	}
	
	// Sets the Last name
	public String getLastName()
	{
		return lastName;
	}
	
	@Override
	public boolean equals(Object e2)
	{
		if(this.employeeNum == ((Employee)e2).employeeNum)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	@Override
	public String toString()
	{
		return String.format(" %s \n %s \n %s \n %s \n ", getEmployeeNumber(), firstName, lastName, gender());
		
	}
	
	public double calculateWeeklyPay()
	{
		return calculateWeeklyPay();
	}

	
	public void annualRaises()
	{
		
	}
	
	// Gives Holiday Bonus
	public  double holidayBonus()
	{
		return holidayBonus();
	}
	
	// Resets week
	public  void resetWeek()
	{
		
	}


	public int compareTo(Employee employee) {
		return 0;
	}}
