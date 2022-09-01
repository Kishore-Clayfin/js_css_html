package collection;


class InvalidNumberException extends Exception
{
	
}
public class CustomException 
{
	static void verifyMobileNumber(String number) throws InvalidNumberException
	{
		if(number.length()!=10)
		{
			throw new InvalidNumberException();
		}
	}
	public static void main(String[] args)
	{
		try
		{
			CustomException.verifyMobileNumber("7892722348");
			CustomException.verifyMobileNumber("6364884446");
			CustomException.verifyMobileNumber("636484446");
			
		}
		catch(InvalidNumberException e) 
		{
			e.printStackTrace();
		}
	}
}
