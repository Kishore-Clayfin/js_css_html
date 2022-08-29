package taskPrograms;


public class Connection
{
	private static Connection con=null;
	public static Connection getConnection()
	{
		if(con==null)
		{
			con=new Connection();
		}
		return con;
	}
	private Connection() {
		System.out.println("Creating Connection Object");
	}
	
	
	
	public static void main(String[] args) {
		//DEV1
		Connection  con1=Connection.getConnection();
		System.out.println(con1);
		//DEV2
		Connection con2=Connection.getConnection();
		System.out.println(con2);
		//DEV3
		Connection con3=Connection.getConnection();
		System.out.println(con3);
	}
}
