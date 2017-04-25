package fyp_management_system;

import FYP_Management_System.*;
import java.util.*;

public class loginsub
{
	private String username;
	public final String getusername()
	{
		return username;
	}
	public final void setusername(String value)
	{
		username = value;
	}
	private String pass;
	public final String getpass()
	{
		return pass;
	}
	public final void setpass(String value)
	{
		pass = value;
	}
	public loginsub(String username, String pass)
	{
		this.setusername(username);
		this.setpass(pass);
	}
}