
package recruiting.request;

import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import recruiting.entity.Group;

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
    
    public void createUser(int id, String username, String password, String first_name, String last_name, Group Id_group, String email, String phone, String active){
        User user = new User(id, username, password, first_name, last_name, Id_group, email, phone, active);
        em.persist(user);
    }

    @Override
    public void createUser(int i, String iuli_200, String pass, String beldiman, String iuliana, int i0, String iulianaemailcom, String yutyu, String atrue) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
 
}
