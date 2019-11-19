/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee.system;

/**
 *
 * @author 4stokr92
 */
public class Employee {
    
    //Attributes
    
    private String name;
    private int pay;
    private int hoursWorked; //weekly
    private int holiday;
    
    //Constructors 
    
    public Employee(String nameIn, int payIn, int hoursWorkedIn, int holidayIn)
    {
        name = nameIn;
        pay = payIn;
        hoursWorked = hoursWorkedIn;
        holiday = holidayIn;
    }
            
    //Methods
    
    public String getName()
    {
        return name;
    }
    
    public int getPay()
    {
        return pay;
    }
    
    public int getHoursWorked()
    {
        return hoursWorked;
    }
    
    public int getHoliday()
    {
        return holiday;
    }
    
    public int yearlySalary()
    {
      return pay;             
    }
    
    
    
    
    
    
    
}
