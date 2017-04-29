package fyp_management_system;

import java.io.Serializable;
import java.util.ArrayList;

public class Cexternal extends Cperson implements Iexternal {

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
    public final void provide_remarks(int studid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public final void view_project(int studid) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
