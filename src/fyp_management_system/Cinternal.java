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
        notifications=new ArrayList<Cnotification>();
        studentlist=new ArrayList<Cstudent>();
    }

    public final void GiveMarks() {
        System.out.println("Marks to student");
        //...
    }

    public final void FrwdExternal() {
        System.out.println("Forward To External");
        //...
    }

    public final void Suggestion() {

        //suggestion for betterment
    }

    public final void VIva() {

        //taking viva for giving them marks according to there projects
    }

    public final void Task() {

        //assign task for betterment of students project
    }
    //testing pull request

}
