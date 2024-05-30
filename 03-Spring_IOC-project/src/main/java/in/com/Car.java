package in.com;

public class Car {
	
	
	public Car() {
		System.out.println("Constratcted...........");
	}
	
	public IEngine eng;
	
	public void setEng(IEngine eng) {
		this.eng=eng;
		
	}
	
	public void driver() {
	  boolean status = eng.start();
	  
	  if(status) {
		  System.out.println("Journy is started");
		  
	  }
	  else
		  System.out.println("journy is not started");
		
	}

}
