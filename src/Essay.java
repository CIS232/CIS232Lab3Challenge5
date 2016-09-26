
public class Essay extends GradedActivity {
	private double grammarGrade=0;
	private double spellingGrade=0;
	private double lengthGrade=0;
	private double contentGrade=0;
	private double score=0;
	
	public double getGrammar()
	{
		return grammarGrade;
	}
	
	public void setGrammar(double x)
	{
		grammarGrade=x;
	}
	
	public double getSpelling()
	{
		return spellingGrade;
	}
	
	public void setSpelling(double x)
	{
		spellingGrade=x;
	}
	
	public double getLength()
	{
		return lengthGrade;
	}
	
	public void setLength(double x)
	{
		lengthGrade=x;
	}
	
	public double getContent()
	{
		return contentGrade;
	}
	
	public void setContent(double x)
	{
		contentGrade=x;
	}
	
	public void setEssayScore()
	{
		score = grammarGrade + spellingGrade + lengthGrade + contentGrade;
	}
	
	
	
}
