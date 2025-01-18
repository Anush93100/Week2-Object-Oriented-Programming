
import java.util.Scanner;

//creating student class
class Student{
	//creating name, rollnumber, marks attributes
	private String name;
	private int rollNumber;
	private double marks;
	private String grades;
	
	//constructor
	Student(String name, int rollNumber, double marks){
		this.name=name;
		this.rollNumber=rollNumber;
		this.marks=marks;
		this.grades=calculateGrade(marks);
	}
	
	//method to calculate grades 
	public String calculateGrade(double marks){
		 if(marks>=80){
		    return "A";
		 }else if(marks>=60){
		    return "B";
		 }else if(marks>=40){
		    return "C";
		 }else{
		    return "F";
		 }
	}
	
	//method to displaying details of Student
	public void displayDetails(){
	     System.out.println("\n-----Student Details-----");
		 System.out.println("Name         :" + name);
		 System.out.println("Roll Number  :" + rollNumber);
		 System.out.println("Marks        :" + marks); 
		 System.out.println("Grade        :" + grades); 
		 System.out.println("--------------------------");
	}
	
}

//creating Student report class
public class StudentReport1{
	public static void main(String[] args){
		Scanner input =new Scanner(System.in);
		
		//taking input from the user
		System.out.println("Enter the name of student :");
		String name=input.nextLine();
		
		//taking input from the user
		System.out.println("Enter the roll Number of Student :");
		int rollNumber=input.nextInt();
	
	    //taking input from the user
		System.out.println("Enter the marks of student (0-100):");
		double marks=input.nextDouble();
		
		//creating object of student class
		Student student1=new Student(name, rollNumber, marks);
		
		//displaying the result
		student1.displayDetails();
		
		input.close();
	}
}