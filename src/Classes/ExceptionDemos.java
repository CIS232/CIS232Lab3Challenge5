package Classes;
import java.util.*;
public class ExceptionDemos 
{

	public static void main(String[] args) throws BlankName, InvalidID, InvalidHours, InvalidRate
	{
		Payroll demo=new Payroll();
		Scanner keyboard=new Scanner(System.in);
		
		//BlankName demonstration
		System.out.println("Please enter employee name:");
		demo.setName(keyboard.nextLine());
		if(demo.getName().isEmpty()){
			throw new BlankName();
		}
		
		//InvalidID Demonstration
		System.out.println("Please enter employee ID:");
		demo.setId((keyboard.nextLine()));
		if(demo.getId().isEmpty()){
			throw new InvalidID();
		}

		//InvalidHours Demonstration
		System.out.println("Please enter the  number of hours this employee worked:");
		boolean valid=false;
		while(valid==false){
			try{
			demo.setHrsWorked((keyboard.nextDouble()));
			valid=true;
			}catch(InputMismatchException e){
				System.out.println("That's not the exception we want to demonstrate here. "
						+ "Please type the hours worked.");
				keyboard.nextLine();
			}
		}
		
		if(demo.getHrsWorked() < 0 || demo.getHrsWorked() > 84){
			throw new InvalidHours();
		}	
		
		
		//InvalidRate Demonstration
		System.out.println("Please enter this employee's pay per hour:");
		valid=false;
		while(valid==false){
			try{
			demo.setPayRate((keyboard.nextDouble()));
			valid=true;
			}catch(InputMismatchException e){
				System.out.println("That's not the exception we want to demonstrate here. "
						+ "Please type the hours worked.");
				keyboard.nextLine();
			}
		}
		
		if(demo.getPayRate() < 0 || demo.getPayRate() > 25){
			throw new InvalidRate();
		}	
		
		
	}

}
