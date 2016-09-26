
public class GradedActivity {
	private double score;
	
	public void setScore(double s)
	{
		score=s;
	}
	
	public double getScore()
	{
		return score;
	}
	
	public char getLetterGrade()
	{
		char lG;
		if(score>=90)
		{
			lG='A';
		}
		else if (score>= 80)
		{
			lG='B';
		}
		else if (score>= 70)
		{
			lG='C';
		}
		else if (score>= 60)
		{
			lG='D';
		}
		else
		{	
			lG='F';
		}
		return lG;
	}





}
