
package recruitingclient;

import javax.ejb.EJB;
import recruiting.request.Request;

public class Main {
    @EJB
    private static Request request;

    public static void main(String[] args) {
        request.createTest("1", "Test 1");
      
    }
    
}
