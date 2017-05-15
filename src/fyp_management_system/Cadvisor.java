package fyp_management_system;

import java.io.Serializable;
import java.util.*;

public class Cadvisor extends Cperson implements Iadvisor,Serializable  {

    private int advisorid;

    public final int getadvisorid() {
        return advisorid;
    }

    public final void setadvisorid(int value) {
        advisorid = value;
    }
    private ArrayList<Cstudent> studentlist;

    public final ArrayList<Cstudent> getstudentlist() {
        return studentlist;
    }

    public final void setstudentlist(ArrayList<Cstudent> value) {
        studentlist = value;
    }
    private ArrayList<Cnotification> notifications;

    public final ArrayList<Cnotification> getnotifications() {
        return notifications;
    }

    public final void setnotifications(ArrayList<Cnotification> value) {
        notifications = value;
    }

    public Cadvisor(int advisorid, String f_name, String l_name, String address, String contact_num, java.time.LocalDateTime dob, String email, Egender gender, int cnic, String username, String pass) {
        this.advisorid = advisorid;
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
        studentlist = new ArrayList<Cstudent>();
        notifications = new ArrayList<Cnotification>();

    }

//done
    @Override
    public final void checking_proposed_idea(int studid) {
        int i = searchid(studid);
        if (i != -1) {
          System.out.println("Project :\n" + studentlist.get(i).getlstofideas().get(studentlist.get(i).getlstofideas().size() - 1).getidea());
            System.out.println("Project :\n" + studentlist.get(i).getlstofideas().get(studentlist.get(i).getlstofideas().size() - 1).getidea());
            System.out.println("1 For Accept\n2 For Reject");
            String s = new Scanner(System.in).nextLine();

            if (s == "1") {

                studentlist.get(i).getlstofideas().get(studentlist.get(i).getlstofideas().size() - 1).setisaccept(true);
                System.out.println("Accepted");
                studentlist.get(i).getnotifications().add(new Cnotification("Idea Accepted", Esub.Project_Accepted, Erole.Advisor, Erole.Student));

                Cproject sp = new Cproject(studentlist.get(i).getlstofideas().get(studentlist.get(i).getlstofideas().size() - 1));
                studentlist.get(i).setselectedproject(sp);

            } else if (s == "2") {
                studentlist.get(i).getlstofideas().get(studentlist.get(i).getlstofideas().size() - 1).setisaccept(false);
                System.out.println("Rejected");
                studentlist.get(i).getnotifications().add(new Cnotification("Idea Rejected", Esub.Project_Rejected, Erole.Advisor, Erole.Student));

            } else {
                System.out.println("Not found");
            }
            save();

        }
//...
    }

//done
    @Override
    public final void provide_recommendation(int studid) {
        int i = searchid(studid);
        if (i != -1) {
            System.out.println(studentlist.get(i).getselectedproject().getprojectidea().getidea());
            System.out.println("Enter Recomendations??");
            String s = new Scanner(System.in).nextLine();
            studentlist.get(i).getnotifications().add(new Cnotification(s, Esub.Recomendation, Erole.Advisor, Erole.Student));
            save();

        } else {
            System.out.println("Not found");
        }

    }

//done
    @Override
    public final void view_project(int studid) {
        int i = searchid(studid);
        if (i != -1) {
            System.out.println("Github Address :" + studentlist.get(i).getselectedproject().getproject_github_address());
        } else {
            System.out.println("Not found");
        }
        // save();
    }

    private int searchid(int studid) {

        for (int i = 0; i < studentlist.size(); i++) {
            if (studentlist.get(i).getstudentid() == studid) {
                return i;
            }
        }
        return -1;
    }

    private void save() {
        for (int i = 0; i < studentlist.size(); i++) {
            for (int j = 0; j < FYP_Management_System.Ocontroler.Lststud.size(); j++) {
                if (studentlist.get(i).getstudentid()
                        == FYP_Management_System.Ocontroler.Lststud.get(j).getstudentid()) {
                    FYP_Management_System.Ocontroler.Lststud.set(j, studentlist.get(i));

                }

            }
        }
        for (int i = 0; i < FYP_Management_System.Ocontroler.Lstadvisor.size(); i++) {
            if (this.advisorid == FYP_Management_System.Ocontroler.Lstadvisor.get(i).advisorid) {
                FYP_Management_System.Ocontroler.Lstadvisor.set(i, this);
                break;
            }
        }
       FYP_Management_System.obj.Mserialize(FYP_Management_System.Ocontroler);

    }

    @Override
    public final void recomendtointernal(int studid, int internalid) {
        int i = searchid(studid);
        if (i != -1) {
            for (int j = 0; j < FYP_Management_System.Ocontroler.Lstinternal.size(); j++) {
                if (FYP_Management_System.Ocontroler.Lstinternal.get(j).getinternalid()
                        == internalid) {
                    FYP_Management_System.Ocontroler.Lstinternal.get(j).getstudentlist().add(studentlist.get(i));
                    FYP_Management_System.Ocontroler.Lstinternal.get(j).getnotifications().add(
                            new Cnotification(
                                    "A Student Is Forwarded To You For Internal Evaluaion",
                                    Esub.InternalEvaluation,
                                    Erole.Advisor,
                                    Erole.Internal));
                    break;
                }
            }

        } else {
            System.out.println("Student IdNot found");

        }
    }
    //merge & done 

}

