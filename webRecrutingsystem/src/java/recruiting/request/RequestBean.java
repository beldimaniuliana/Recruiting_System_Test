
package recruiting.request;

import javax.ejb.EJBException;
import javax.ejb.Stateful;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import recruiting.entity.Test;

@Stateful
public class RequestBean implements Request{
    @PersistenceContext
    private EntityManager em;
    
    public void Test(Integer id, String name){
         Test t = new Test(id, name);
         em.persist(t);
     }
}
