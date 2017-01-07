
package recruiting.request;

import java.util.List;
import javax.ejb.Remote;
import recruiting.entity.Role;
import recruiting.entity.User;

@Remote
public interface Request {
   
    void Test(Integer id, String name);
    
    public void CreateTest(Integer id, String name);

    public User getUser(Integer userId); 
    
    public void createUser(Integer id, String username, String password, String firstName, String lastName, String email, int phone, int active, int role);
    
    public List<User> getAllUsers();
    
    public List<Role> getAllRoles();
}
