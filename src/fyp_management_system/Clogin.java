
package fyp_management_system;
import FYP_Management_System.*;
import java.util.*;

public class Clogin
{

	public Clogin(Erole role, loginsub user)
	{
		if (role == Erole.Student)
		{
//                        ///ArrayList<Cstudent> stlist = FYP_Management_System.Ocontroler.Lststud;
//
//                        for (int i = 0; i < stlist.size(); i++)
//                        {
//                                if (user.getusername().equals(stlist.get(i).getusername()) && stlist.get(i).getpassword().equals(user.getpass()))
//                                {
//                                        System.out.println("Welcome " + stlist.get(i).getfirstname());
//                                        //set Environment
//                                }
//                        }
		}
		else if (role == Erole.Advisor)
		{
//			//ArrayList<Cadvisor> advisorlst = Program.Ocontroler.Lstadvisor;
//
//			for (int i = 0; i < advisorlst.size(); i++)
//			{
//				if (user.getusername().equals(advisorlst.get(i).getusername()) && advisorlst.get(i).getpassword().equals(user.getpass()))
//				{
//					System.out.println("Welcome " + advisorlst.get(i).getfirstname());
//					//set Environment
//
//				}
//			}
		}
		else if (role == Erole.Internal)
		{
//			ArrayList<Cinternal> internallst = Program.Ocontroler.Lstinternal;
//
//			for (int i = 0; i < internallst.size(); i++)
//			{
//				if (user.getusername().equals(internallst.get(i).getusername()) && internallst.get(i).getpassword().equals(user.getpass()))
//				{
//					System.out.println("Welcome " + internallst.get(i).getfirstname());
//					//set Environment
//
//				}
//			}
		}
		else if (role == Erole.External)
		{
//			ArrayList<Cexternal> externallst = Program.Ocontroler.Lstexternal;
//
//			for (int i = 0; i < externallst.size(); i++)
//			{
//				if (user.getusername().equals(externallst.get(i).getusername()) && externallst.get(i).getpassword().equals(user.getpass()))
//				{
//					System.out.println("Welcome " + externallst.get(i).getfirstname());
//					//set Environment
//
//				}
//			}
		}
		else
		{

		}
	}
}