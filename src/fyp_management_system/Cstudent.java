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
        private Cadvisor myadvisor;
        public final Cadvisor getmyadvisor()
        {
                return myadvisor;
        }
        public final void setmyadvisor(Cadvisor value)
        {
                myadvisor = value;
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
	private ArrayList<Cnotification> notifications;
	public final ArrayList<Cnotification> getnotifications()
	{
		return notifications;
	}
	public final void setnotifications(ArrayList<Cnotification> value)
	{
		notifications = value;
	}

	public Cstudent()
	{

	}
	public Cstudent(String f_name, String l_name, String address, String contact_num, java.time.LocalDateTime dob, String email, Egender gender, int cnic, String username, String pass,int studid,double  cgpa)
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
                studentid=studid;
                this.cgpa=cgpa;
                
                lstofideas=new ArrayList<Cidea>();
                notifications=new ArrayList<Cnotification>();

	}

        //done
	public final void proposeidea(String idea)
	{
                lstofideas.add(new Cidea(idea));
                lstofideas.get(lstofideas.size()-1).setispropose(true);
            for (int i = 0; i < FYP_Management_System.Ocontroler.Lstadvisor.size(); i++) {
                if (FYP_Management_System.Ocontroler.Lstadvisor.get(i)==this.myadvisor) {
                    FYP_Management_System.Ocontroler.
                            Lstadvisor.get(i).getnotifications().add(
                            new Cnotification("An idea has been propoesed From Student ID : "
                                    +this.studentid,Esub.Proposed_Idea,Erole.Student,Erole.Advisor));
                }
            }
            //added to the list of selected advisor 
                //.....
	}
        //done
	public final void updateproject(String addr,String commit)
	{
            selectedproject.setproject_github_address(addr);
            selectedproject.getcommit().add(commit);
		System.out.println("Updated");
	   //
	}
        //done
	public final void checkrecomendation(Cproject myproject)
	{
		for (int i = 0; i < notifications.size(); i++) 
                {
                    if (notifications.get(i).getsubject()==Esub.Recomendation) {
                        notifications.get(i).printresomendation();
                    }
                }
             
	}
        
        //done
         public final void viewall_sdvisor()
	{
		ArrayList<Cadvisor> temp=FYP_Management_System.Ocontroler.Lstadvisor;
                for (int i = 0; i < temp.size(); i++) {
                    System.out.println(temp.get(i).getadvisorid()+"\n"+temp.get(i).getfirstname()); 
            }
		//advisor detail to work under his guidance
	}
         
         
        
        
        //Done
         public final void selectadvisor(String adviisorid)
	{
            for (int i=0;i<FYP_Management_System.Ocontroler.Lstadvisor.size();i++){
                myadvisor.getstudentlist().add(this);
                        
                myadvisor=FYP_Management_System.Ocontroler.Lstadvisor.get(i);
	}}
}