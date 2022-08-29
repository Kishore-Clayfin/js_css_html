package taskPrograms;

public class MemoryConvertion 
{
	public static void main(String[] args)
	{
		
		double size_bytes=1048576d;
		
		double inkB = size_bytes /1024;
		double inMB = inkB/ 1024;
		double inGB= inMB / 1024 ;
		
		
		 
	    System.out.println(inGB + " GB");
	        
		 
	    System.out.println(inMB + " MB");
	    
	    System.out.println(inkB + " KB");
	             
				
	}
}
