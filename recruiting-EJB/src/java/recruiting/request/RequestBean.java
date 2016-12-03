
package recruiting.request;

import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import recruiting.entity.Candidate;
import recruiting.entity.Group;
import recruiting.entity.Job;
import recruiting.entity.Privilage;
import recruiting.entity.Test;
import recruiting.entity.User;


@Stateful
public class RequestBean implements Request{
    @PersistenceContext
    private EntityManager em;
    
    public void createTest(String id, String name) {
        Test test = new Test(id, name);
        em.persist(test);
    }
    
    public void createJob(int id, String position, String requirements, String locuri, String status, String data){
        Job job = new Job(id,position,requirements,locuri,status,data);
         em.persist(job);
    }

    
    public void createCandidate(int i, String first_name, String last_name) {
       Candidate candidate = new Candidate(i, first_name, last_name);
        em.persist(candidate);
    }

    
    public void addCandidate(int candidateId, int jobId) {
           Candidate candidate = em.find(Candidate.class, candidateId);
            Job job = em.find(Job.class, jobId);

            candidate.addJob(job);
            job.addCandidate(candidate);
    }
    
    
    
     /*
    public void createUser(int id, String username, String password, String first_name, String last_name, int Id_group, String email, String phone, String active){
        User user = new User(id, username, password, first_name, last_name, Id_group, email, phone, active);
        em.persist(user);
    }
*/
  
}
