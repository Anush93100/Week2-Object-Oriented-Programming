
//creating Student class
class Student{
	static String universityName;
	String name;
	final int rollnumber;
	static int totalStudents=0;
	String grade;
	
	//constructor
	Student(String name, String grade){
		Student.universityName="RGPV";
		this.name=name;
		this.grade=grade;
		totalStudents++;
	    this.rollnumber=100+totalStudents;
	}
	
	//method to display Total number of students
	public static void displayTotalStudents(){
		System.out.println("\nTotal Number of Students  :" + totalStudents );
	}
	
	//method to upgrade grades
	public void upgradeGrades(String grade){
		this.grade =grade;
	}
	
	//method to display details
	public static void displayDetails(Student student){
	    if(student instanceof Student){
		    System.out.println("\n-----Students Details-----");
			System.out.println("Student Name     :" + student.name);
			System.out.println("Roll no.         :" + student.rollnumber);
			System.out.println("Grade            :" + student.grade);
			System.out.println("University name  :" + student.universityName);
	    }else{
			System.out.println("Given Object is not an instance of Student class");
		}
	}
}

//creating UniversityMangement System
public class UniversityManagementSystem5{
	public static void main(String args[]){
		
		Student student1=new Student("Anush Tenguriya", "B");
		Student.displayDetails(student1);
		
		Student student2=new Student("Ojas Johar", "A");
		Student.displayDetails(student2);
		
		student2.upgradeGrades("B");
		System.out.println("Upgrading grades.");
        Student.displayDetails(student2);
		
		Student.displayTotalStudents();
	}
}