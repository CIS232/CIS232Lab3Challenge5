package Classes;

public class BlankName extends Exception{

	 public BlankName(){
	        super();
	        System.out.println("Exception BlankName has been thrown");
	    }

	    public BlankName(String message){
	        super(message);
	    }
}
