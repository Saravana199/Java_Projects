package com.collections;

public class Student {
	
	private int rollno,age;
	   private String name;
	   private char grade;
	   private int count;
	  
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
	  
		@Override
		public String toString() {
			return "Student [rollno=" + rollno + ", age=" + age + ", name=" + name + ", grade=" + grade + "]";
		}
		
	}


