package fyp_management_system;

import java.io.Serializable;
import java.util.*;
//done 
public class Cidea implements Serializable
{
	private String idea;
	public final String getidea()
	{
		return idea;
	}
        
	public final void setidea(String value)
	{
		idea = value;
	}
        
	private boolean ispropose;
	public final boolean getispropose()
	{
		return ispropose;
	}
        
	public final void setispropose(boolean value)
	{
		ispropose = value;
	}
        
	private boolean isaccept;
	public final boolean getisaccept()
	{
		return isaccept;
	}
        
	public final void setisaccept(boolean value)
	{
		isaccept = value;
	}
        
	public Cidea(String idea)
	{
		this.setidea(idea);
		setisaccept(false);
		setispropose(true);
	}
}
