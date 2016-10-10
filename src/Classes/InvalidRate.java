package Classes;

public class InvalidRate extends Exception{
	 public InvalidRate(){
	        super();
	        System.out.println("Exception InvalidRate has been thrown");
	    }

	    public InvalidRate(String message){
	        super(message);
	    }
}
