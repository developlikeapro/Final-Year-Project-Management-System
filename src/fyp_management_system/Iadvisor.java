package fyp_management_system;

public interface Iadvisor {

    void checking_proposed_idea(int studid);

    void provide_recommendation(int studid);

    void view_project(int studid);

     void recomendtointernal(int studid, int internalid);
}
