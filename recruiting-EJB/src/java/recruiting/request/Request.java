
package recruiting.request;

import javax.ejb.Remote;
import recruiting.entity.Group;

@Remote
public interface Request {
    void createTest(String id, String name);
    public void createUser(int id, String username, String password, String first_name, String last_name, Group Id_group, String email, String phone, String active);

    public void createUser(int i, String iuli_200, String pass, String beldiman, String iuliana, int i0, String iulianaemailcom, String yutyu, String atrue);

}
