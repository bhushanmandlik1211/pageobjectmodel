package encapsulation;

public class Student {
	
	private String name;
	private String address;
	private int age;
	private String mb_no;
	
	public String getname() 
	{
		return name;
	}
	public String getaddress() 
	{
		return address;
	}
	public int getage()
	{
		return age;
	}
	public String getmb_no()
	{
		return mb_no;
	}
	
	public void setname(String newname) 
	{
		name=newname;
	}
	public void setaddress(String newaddress) 
	{
		address=newaddress;
	}
	public void setage(int newage)
	{
		age=newage;
	}
	public void setmb_no(String newmb_no)
	{
		mb_no=newmb_no;
	}
}
