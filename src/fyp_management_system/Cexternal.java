package fyp_management_system;

import java.io.Serializable;
import java.util.ArrayList;

public class Cexternal extends Cperson implements Iexternal {

    private ArrayList<String> Cstudent;

    public final ArrayList<String> getstudents() {
        return Cstudent;
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
    private ArrayList<String> notifications;

    public final ArrayList<String> getnotifications() {
        return notifications;
    }

    public final void setnotifications(ArrayList<String> value) {
        notifications = value;
    }

    public final void PassS() {

        //Check project that it match with given criteria or not
    }

    public final void FailS() {
        //Check project that it match with given criteria or not
    }

    public final void Remarks() {

        //give remarks according to projects for job accomplish
    }
}
