package driver;

import java.lang.Math.*; 

public class Main {

	public static void main(String[] args) {
		double testtimeDisciple = timeDiscipleProblem(13, 2, 3, 7700000000d);
		double teststudentDisciple = studentDiscipleProblem(13, 3, 50, 7700000000d);
		System.out.println(testtimeDisciple);
		System.out.println(teststudentDisciple);
	}

	public static double timeDiscipleProblem(double disciples, double students, double studentYears, double population)
	{
		//Question 1:
		//13 disciples, after 3 years, becomes 39 total disciples,
		//all of whom can then teach 2 disciples each. Thus, The total
		//number of disciples is being multiplied by 3 every 3 years. 
		//13 * 3^(x/3) = 7.7 billion --> solve for x
		double completionTime = ((Math.log(population/disciples))/Math.log(students + 1))*studentYears;
		return completionTime;
	}
	
	public static double studentDiscipleProblem(double disciples, double studentYears, double totaleYears, double population)
	{
		//Question 2:
		//Given 2 disciples trained together will result in 7.7 billion 
		//in 55 years, the number of students needs to be increased. 
		//However, you cannot train half of a student, so the minimum 
		//increase to take 50 or less years would be 3 students.
		
		//If we can train a fraction of a student, 
		//then we just solve for x in this case:
		//13 * x^(50/3) = 7.7 billion
		double studentsNeeded = (Math.exp(((Math.log(population/disciples)*3)/50)) - 1);
		return studentsNeeded;
	}
	
 
}
