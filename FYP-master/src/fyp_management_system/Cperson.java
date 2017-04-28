package fyp_management_system;

public class Cperson 
{
	private String firstname;
	public final String getfirstname()
	{
		return firstname;
	}
	public final void setfirstname(String value)
	{
		firstname = value;
	}
	private String lastname;
	public final String getlastname()
	{
		return lastname;
	}
	public final void setlastname(String value)
	{
		lastname = value;
	}
	private String address;
	public final String getaddress()
	{
		return address;
	}
	public final void setaddress(String value)
	{
		address = value;
	}
	private String contactnumber;
	public final String getcontactnumber()
	{
		return contactnumber;
	}
	public final void setcontactnumber(String value)
	{
		contactnumber = value;
	}
	private java.time.LocalDateTime DOB = java.time.LocalDateTime.MIN;
	public final java.time.LocalDateTime getDOB()
	{
		return DOB;
	}
	public final void setDOB(java.time.LocalDateTime value)
	{
		DOB = value;
	}
	private String Email;
	public final String getEmail()
	{
		return Email;
	}
	public final void setEmail(String value)
	{
		Email = value;
	}
	private Egender gemder = Egender.values()[0];
	public final Egender getgemder()
	{
		return gemder;
	}
	public final void setgemder(Egender value)
	{
		gemder = value;
	}
	private int cnic;
	public final int getcnic()
	{
		return cnic;
	}
	public final void setcnic(int value)
	{
		cnic = value;
	}
	private String username;
	public final String getusername()
	{
		return username;
	}
	public final void setusername(String value)
	{
		username = value;
	}
	private String password;
	public final String getpassword()
	{
		return password;
	}
	public final void setpassword(String value)
	{
		password = value;
	}
}