import java.util.*;
import java.text.DecimalFormat;
public class EssayDemo {
	public static void main(String[] args)throws Exception
	{
		String student=setName();
		Scanner keyboard=new Scanner(System.in);
		Essay myEssay= new Essay();
		DecimalFormat gradeFormat=new DecimalFormat("#0.00");
		
		myEssay.setGrammar(checkGrade("Grammar", 30));
		myEssay.setSpelling(checkGrade("Spelling", 20));
		myEssay.setLength(checkGrade("Length", 20));
		myEssay.setContent(checkGrade("Content", 30));
		
		myEssay.setScore(myEssay.getContent() + myEssay.getGrammar() + myEssay.getLength() + 
				myEssay.getSpelling());
		
		System.out.println(student + "'s essay got a " + gradeFormat.format(myEssay.getScore()) + ", or a(n) " + myEssay.getLetterGrade());
		keyboard.close();
	}

	
	public static double checkGrade (String subject, int max)
	{
		double x=0;
		Scanner keyboard=new Scanner(System.in);
		Boolean valid=false;
		while (!valid)
		{
			System.out.println("Please enter the essay's " + subject + " score: (0-" + max + ")");
				try 
				{
					x=keyboard.nextDouble();
					if(x >= 0 && x <= max)
					{
						valid=true;
					}
					else
					{
						System.out.println("That's not a valid grade. Please try again.");
					}
				}catch(InputMismatchException e) {
					System.out.println("That's not a valid grade. Please try again.");
					keyboard.nextLine();
			    }
		}
		return x;
	}
	
	
	public static String setName()
	{
		Scanner keyboard=new Scanner(System.in);
		String student="";
		int msgCounter=1;
		while (student.isEmpty())
		{
			System.out.println(getMsg(msgCounter));
			student = keyboard.nextLine();
			if (++msgCounter >= 7)
			{
				student=defaultName();
			}
		}
		return student;
	}
	
	public static String getMsg(int x)
	{
		String y="Please enter the name of the essay's author:";
		switch(x)
		{
			case 1:
				y= "Please enter the name of the essay's author:";
				break;
			case 2:
				y= "Uhhh...Please enter the name of the student who wrote the essay.";
				break;
			case 3:
				y= "You can do that by typing on your keyboard." ;
				break;
			case 4:
				y= "It's not hard. Most 8 year olds have mastered the art of typing a name." ;
				break;
			case 5:
				y= "I'm assuming that either your keyboard is broken or you can't read. Either way, "
						+ "I'm gonna call the kid Ethel now." ;
				break;
			default:
				//this should not display
				y="It's Ethel now. You had your chance.";
				break;
		}
		return y;
	}
	
	public static String defaultName()
	{
		return "Ethel";
	}
}
