package Classes;

public class InvalidID extends Exception{
	 public InvalidID(){
	        super();
	        System.out.println("Exception InvalidID has been thrown");
	    }

	    public InvalidID(String message){
	        super(message);
	    }
}
