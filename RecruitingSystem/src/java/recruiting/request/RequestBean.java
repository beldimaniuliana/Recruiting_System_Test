
package recruiting.request;

import java.util.List;
import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import recruiting.entity.Role;
import recruiting.entity.Test;
import recruiting.entity.User;

@Stateful
public class RequestBean {
    @PersistenceContext
    private EntityManager em;
    
    public void Test(Integer id, String name){
         Test t = new Test(id, name);
         em.persist(t);
    }
    
    public void CreateTest(Integer id, String name){
         Test t = new Test(id, name);
         em.persist(t);
    }
    
    public User getUser(Integer userId) {
            User user = em.find(User.class, userId);
            return user;
    }
    
    public void createUser(Integer id, String username, String password, String firstName, String lastName, String email, int phone, int active, int role){
            User user = new User(id, username, password, firstName, lastName, email, phone, active);
            Role idGroup = em.find(Role.class, role);
            user.setIdGroup(idGroup);
            em.persist(user);
    }
    
    public List<User> getAllUsers(){     
        List<User> users = null;
        try {
           users = (List<User>) em.createNamedQuery(
                       "User.findAll").getResultList();
           return users;
            
         }catch (Exception ex) {
           throw new EJBException(ex);
        }
    }
    
    public List<Role> getAllRoles(){       
        List<Role> roles = null;
        try {
           roles = (List<Role>) em.createNamedQuery(
                       "Role.findAll").getResultList();
           return roles;
            
        }
        catch (Exception ex) {
           throw new EJBException(ex);
        }
    }
    
}
