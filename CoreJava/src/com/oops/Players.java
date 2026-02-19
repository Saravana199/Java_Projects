package com.oops;

public class Players {
	
	String name;
	int jersynum;
	
	public Players (String name, int jersynum) {
		
		this.name = name;
		this.jersynum= jersynum;
	}
	
	public void fulldetails(int id) {
		System.out.println("Full Details is :" + id + name + jersynum);
	}
	
	public void invalid_id(int id) throws Invalid_Id_Exception {
		
		if(id==1) {
			
		System.out.println("The id is valid");	
		}
		else {
			
			throw new Invalid_Id_Exception(id);
		}
		
	}
              public static void main(String [] args) {
            	   
            	  Players c = new Players("ram",10);
            	  c.fulldetails(4);
            	  try {
					c.invalid_id(1);
				} catch (Invalid_Id_Exception e) {
					
					e.printStackTrace();
				}
              }
}
