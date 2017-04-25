package fyp_management_system;

import java.util.*;

public class Cstudent extends Cperson implements Istudent
{
	private int studentid;
	public final int getstudentid()
	{
		return studentid;
	}
	public final void setstudentid(int value)
	{
		studentid = value;
	}
	private double cgpa;
	public final double getcgpa()
	{
		return cgpa;
	}
	public final void setcgpa(double value)
	{
		cgpa = value;
	}
	private ArrayList<Cidea> lstofideas;
	public final ArrayList<Cidea> getlstofideas()
	{
		return lstofideas;
	}
	public final void setlstofideas(ArrayList<Cidea> value)
	{
		lstofideas = value;
	}
	private Cproject selectedproject;
	public final Cproject getselectedproject()
	{
		return selectedproject;
	}
	public final void setselectedproject(Cproject value)
	{
		selectedproject = value;
	}
	private ArrayList<String> notifications;
	public final ArrayList<String> getnotifications()
	{
		return notifications;
	}
	public final void setnotifications(ArrayList<String> value)
	{
		notifications = value;
	}

	public Cstudent()
	{

	}
	public Cstudent(String f_name, String l_name, String address, String contact_num, java.time.LocalDateTime dob, String email, Egender gender, int cnic, String username, String pass)
	{
		setfirstname(f_name);
		setlastname(l_name);
		this.setaddress(address);
		setcontactnumber(contact_num);
		setDOB(dob);
		setEmail(email);
		this.setgemder(getgemder());
		this.setcnic(cnic);
		this.setusername(username);
		this.setpassword(pass);
	}

	public final void proposeidea(Cidea idea)
	{
		System.out.println("Proposed");
		//added to the list of selected advisor 
	}

	public final void submitproject(Cproject myproject)
	{
		System.out.println("Submited");
	   //
	}
	public final void checkrecomendation(Cproject myproject)
	{
		System.out.println("Submited");
		//
	}
}