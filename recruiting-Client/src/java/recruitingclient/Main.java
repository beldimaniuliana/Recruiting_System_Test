
package recruitingclient;

import javax.ejb.EJB;
import recruiting.request.Request;


public class Main {
    @EJB
    private static Request request;
    private static Request user;

    public static void main(String[] args) {
        //request.createTest("1", "Test 1");
        //user.createUser(1, "iuli_200", "pass", "Beldiman", "Iuliana", 1, "iuliana@email.com", "yutyu", "true");
    }
    
}
