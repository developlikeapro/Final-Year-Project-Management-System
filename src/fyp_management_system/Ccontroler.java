package fyp_management_system;

import java.io.Serializable;
import java.util.*;

public class Ccontroler 
{
	public ArrayList<Cstudent> Lststud;
	public ArrayList<Cadvisor> Lstadvisor;
	public ArrayList<Cinternal> Lstinternal;
	public ArrayList<Cexternal> Lstexternal;

	public Ccontroler()
	{
		Lststud = new ArrayList<Cstudent>();
		Lstadvisor = new ArrayList<Cadvisor>();
		Lstinternal = new ArrayList<Cinternal>();
		Lstexternal = new ArrayList<Cexternal>();
	}
}