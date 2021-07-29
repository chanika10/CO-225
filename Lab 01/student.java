import java.math.*;
import java.util.Random;
import java.io.*;

class student{
	
	final int max=45;
	static int total=0;//initial value
	
	public double attend(){
		int randm = (int)(Math.random() * 45); // cast to int
	
		total=total+randm;					//adding the random value to the total
		double percn=(double)(randm *100/ 45); //average attendance of the student
	return percn;
	}
	
	public void average(){
		System.out.println("avg="+total*100/(61*45));//printing the average
	}
}