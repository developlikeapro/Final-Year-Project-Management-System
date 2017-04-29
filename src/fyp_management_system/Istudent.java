package fyp_management_system;

import java.io.Serializable;

public interface Istudent extends Serializable{

    void proposeidea(String idea);

    void updateproject(String addr, String commit);

    void checkrecommendation();

    void viewall_sdvisor();

    void selectadvisor(int adviisorid);
}
