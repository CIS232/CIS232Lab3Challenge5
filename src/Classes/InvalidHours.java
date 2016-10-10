package Classes;

public class InvalidHours extends Exception{
	 public InvalidHours(){
	        super();
	        System.out.println("Exception InvalidHours has been thrown");
	    }

	    public InvalidHours(String message){
	        super(message);
	    }
}
