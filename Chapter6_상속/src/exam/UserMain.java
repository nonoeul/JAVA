package exam;

class User{
	Membersystem ms = new Membersystem();
	
	public void join()
	{
		ms.join();
	}
	
	public void print()
	{
		ms.print();
	}
	
	
}



public class UserMain {
	public static void main(String[] args) {
	
		User hong=new User();
		hong.join();
		hong.print();
		
		User sim=new User();
		sim.join();
		sim.print();
		
		
	}
}




















