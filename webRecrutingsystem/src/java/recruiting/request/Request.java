
package recruiting.request;

import javax.ejb.Remote;

@Remote
public interface Request {
    void Test(Integer id, String name);
}
