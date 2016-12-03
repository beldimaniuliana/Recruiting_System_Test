
package recruiting.request;

import javax.ejb.Remote;
import recruiting.entity.Group;

@Remote
public interface Request {
    void createTest(String id, String name);
    
    void createJob(int id, String position, String requirements, String locuri, String status, String data);
    public void createCandidate(int i, String first_name, String last_name);
     //in functia de mai jos se insereaza in tabela de legatura
    void addCandidate(int candidateId, int jobId);

  //  void createUser(int id, String username, String password, String first_name, String last_name, int Id_group, String email, String phone, String active);
  //  void createPrivilage(int id, String name, String discription);
    //public void createUser(int i, String iuli_200, String pass, String beldiman, String iuliana, int i0, String iulianaemailcom, String yutyu, String atrue);


}
