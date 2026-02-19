package com.oops;

public class Invalid_Id_Exception extends Exception {
	
	private int id;
	
	public Invalid_Id_Exception (int id) {
		this.id = id;
	}
	
	public int getid() {
		
		return id;
	}

}
