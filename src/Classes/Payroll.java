package Classes;

public class Payroll {
private String name="", id="";
private double payRate=0, hrsWorked=0;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public double getPayRate() {
	return payRate;
}
public void setPayRate(double payRate) {
	this.payRate = payRate;
}
public double getHrsWorked() {
	return hrsWorked;
}
public void setHrsWorked(double hrsWorked) {
	this.hrsWorked = hrsWorked;
}

public double getPay()
{
	return payRate * hrsWorked;
}
	
	
	
	
	
}
