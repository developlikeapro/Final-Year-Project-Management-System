package fyp_management_system;

import java.util.ArrayList;

public class Cinternal extends Cperson implements Iinternal {

    private int internalid;

    public final int getinternalid() {
        return internalid;
    }

    public final void setinternalid(int value) {
        internalid = value;
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

    public Cinternal(String f_name, String l_name, String address, String contact_num, java.time.LocalDateTime dob, String email, Egender gender, int cnic, String username, String pass) {
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
        notifications = new ArrayList<Cnotification>();
        studentlist = new ArrayList<Cstudent>();
    }

    //testing pull request
    @Override
    public final void provide_reremarks(int studid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final void view_project(int studid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final void recomendtoexternal(int studid, int externalid) {
        int i = searchid(studid);
        if (i != -1) {
            for (int j = 0; j < FYP_Management_System.Ocontroler.Lstexternal.size(); j++) {
                if (FYP_Management_System.Ocontroler.Lstexternal.get(j).getinternalid()
                        == externalid) {
                    FYP_Management_System.Ocontroler.Lstexternal.get(j).getstudentlist().add(studentlist.get(i));
                    FYP_Management_System.Ocontroler.Lstexternal.get(j).getnotifications().add(
                            new Cnotification(
                                    "A Student Is Forwarded To You For External Evaluaion",
                                    Esub.ExternalEvaluation,
                                    Erole.Internal,
                                    Erole.External));
                    break;
                }
            }

        } else {
            System.out.println("Student IdNot found");

        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
     private int searchid(int studid) {

        for (int i = 0; i < studentlist.size(); i++) {
            if (studentlist.get(i).getstudentid() == studid) {
                return i;
            }
        }
        return -1;
    }

}
