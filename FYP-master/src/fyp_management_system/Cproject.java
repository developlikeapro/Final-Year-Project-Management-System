package fyp_management_system;

import java.util.ArrayList;

public class Cproject
{
        private Cidea projectidea;
	public final Cidea getprojectidea()
	{
		return projectidea;
	}
	public final void setprojectidea(Cidea value)
	{
		projectidea = value;
	}
        private String project_github_address;
        public final String getproject_github_address()
        {
                return project_github_address;
        }
        public final void setproject_github_address(String value)
        {
                project_github_address = value;
        }

        private ArrayList<String> commit;
        public final ArrayList<String> getcommit()
        {
                return commit;
        }
        public final void setcommit(ArrayList<String> value)
        {
                commit = value;
        }


        public Cproject(Cidea projectidea)
        {
            this.projectidea=projectidea;
            commit= new ArrayList<String>();
        }
}