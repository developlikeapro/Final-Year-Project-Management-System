package fyp_management_system;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class Cexternal extends Cperson implements Iteacherbehaviours {

    private int externalid;

    public final int getinternalid() {
        return externalid;
    }

    public final void setinternalid(int value) {
        externalid = value;
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

    public Cexternal(String f_name, String l_name, String address, String contact_num, java.time.LocalDateTime dob, String email, Egender gender, int cnic, String username, String pass) {
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

    @Override
    public void provide_recommendation(int studid) {
        int i = searchid(studid);
        if (i != -1) {
            System.out.println(studentlist.get(i).getselectedproject().getprojectidea().getidea());
            System.out.println("Enter Recomendations??");
            String s = new Scanner(System.in).nextLine();
            studentlist.get(i).getnotifications().add(new Cnotification(s, Esub.Recomendation, Erole.External, Erole.Student));
            save();

        } else {
            System.out.println("Not found");
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void view_project(int studid) {
        int i = searchid(studid);
        if (i != -1) {
            System.out.println("Github Address :" + studentlist.get(i).getselectedproject().getproject_github_address());
        } else {
            System.out.println("Not found");
        }
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
        for (int i = 0; i < FYP_Management_System.Ocontroler.Lstexternal.size(); i++) {
            if (this.externalid == FYP_Management_System.Ocontroler.Lstexternal.get(i).externalid) {
                FYP_Management_System.Ocontroler.Lstexternal.set(i, this);
                break;
            }
        }
        //FYP_Management_System.obj.Mserialize(FYP_Management_System.Ocontroler);

    }

}
