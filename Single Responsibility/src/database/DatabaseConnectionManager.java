package database;

public class DatabaseConnectionManager {
	
	public void getManagerInstance(){
		System.out.println("Got the ManagerInstance");
	}
	
	public void connect(){
		System.out.println("Connected to Database");
	}
	
	public void getConnectionObject(){
		System.out.println("Got Connection Object");
	}
	
	public void disconnect(){
		System.out.println("Disconnected from Database");
	}
}
