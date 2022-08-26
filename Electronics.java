package taskPrograms;

public class Electronics 
{
	
	void audio() 
	{
		System.out.println("Audio()...");
	}
	void listen()
	{
		 System.out.println("Listening()..");
	}
	public static void main(String[] args) 
	{
		TV t=new TV();
		DVD d=new DVD();
		Raio r=new Raio();
		t.audio();
		t.listen();
		t.changeChannel();
		System.out.println();
		
		d.audio();
		d.listen();
		d.read();
		System.out.println();

		r.audio();
		r.listen();
		r.fm();
	}
}
class TV extends Electronics
{
	void changeChannel()
	{
		System.out.println("Changing channel");
	}
}
class DVD extends Electronics
{
	void read()
	{
		System.out.println("Reading cd");
	}
}
class Raio extends Electronics
{
	void fm()
	{
		System.out.println("Playing radio");
	}
}