package com.oops;

public class Student {

	
		
		// Object--> Attribute and behavior
		           // properties and functions/methods
		//Return type-->all data types,void .
		
		
		   private int rollno,age;
		   private String name;
		   private char grade;
		   private int count;
		    public Student()
		    {
		    	rollno=100;
		    	age=20;
		    	name="Sachin";
		    	grade='A';
		    }
		    public Student(int rollno,int age,String name,char grade)
		    {
		    	this.rollno=rollno;
		        this.age=age;
		    	this.name=name;
		    	this.grade=grade;
		    }
		    public char getGrade() //getter
		    {
		    	return grade;
		    }
		    public int getRollNo()
		    {
		    	return rollno;
		    }
		    public void setGrade(char grade)  //B
		    {
		         this.grade=grade;	
		    }
		   public void printDetails()
		   {
			   System.out.println(rollno+" "+age+" "+name+" "+grade);
			   
		   }
			public static void main(String[] args)
			{
			//int	x=10;
			  Student student1=new Student(); //memory allocation and calling constructor
			  //student1.rollno=101;
			  student1.printDetails();
			  student1.setGrade('B');
			  student1.printDetails();
			  
			  Student student2=new Student(102,19,"Payal",'B');
			  //student1.rollno=101;
			  student2.printDetails();
			  student2.setGrade('C');
			  student2.printDetails();
			 System.out.println("Student 1 and Student 2 Grades :"+student1.getGrade()+" "+student2.getGrade());
		 
			}
		 
		

	}

}
