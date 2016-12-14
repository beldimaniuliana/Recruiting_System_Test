
package recruiting.request;

import javax.ejb.Remote;
import recruiting.entity.Group;
import recruiting.entity.Person;
import recruiting.entity.PersonDetail;
import recruiting.entity.Test2;

@Remote
public interface Request {
    
    void createTest(String id, String name);
    void createTest2(int id, String name);

    void createPerson(int personId, String personName);
    void createPersonDetails(int personDetailId, String zipCode, String job, double income);
    void createPersonWithDetails(int personId, String personName, int personDetailId, String zipCode, String job, double income);
    
    
    void createJob(int id, String position, String requirements, String locuri, String status, String data);
  
    public void createCandidate(int i, String first_name, String last_name);
     //in functia de mai jos se insereaza in tabela de legatura
    void addCandidate(int candidateId, int jobId);
    
    void dropCandidate(int candidateId, int jobId);

    void removeCandidate(int candidateId);
   
    void removeJob(int jobId);
    
    void createGroup(int id, String name);
    
    void addPrivilage(int privilageId,int groupId);
    
    void createUser(int id, String username, String password, String first_name, String last_name, Group Id_group, String email, String phone, String active);
   

}


   
  //  void createPrivilage(int id, String name, String discription);
    //public void createUser(int i, String iuli_200, String pass, String beldiman, String iuliana, int i0, String iulianaemailcom, String yutyu, String atrue);

