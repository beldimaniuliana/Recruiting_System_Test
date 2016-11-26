
package recruiting.request;

import javax.ejb.Remote;

@Remote
public interface Request {
    void createTest(String id, String name);
}
