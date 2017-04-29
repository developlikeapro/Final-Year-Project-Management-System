package fyp_management_system;

import java.io.Serializable;

public interface Iadvisor extends Iteacherbehaviours,Serializable {

    void checking_proposed_idea(int studid);

    

     void recomendtointernal(int studid, int internalid);
}
