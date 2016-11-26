
package recruiting.request;

import javax.ejb.Remote;

@Remote
public interface Request {
    void createTest(String id, String name);
    void createUser(int id,String username, String password, String first_name, String last_name, int id_group, String email, String phone, String active);
}
