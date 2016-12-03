
package recruitingclient;

import javax.ejb.EJB;
import recruiting.entity.Group;
import recruiting.request.Request;


public class Main {
    @EJB
    private static Request request;
    private static Request user;

    public static void main(String[] args) {
      //  request.createTest("2", "Test 2");
        request.createCandidate(1, "first_name", "last_name");
        request.createJob(1, "position", "requirements", "locuri", "status", "data");
        request.addCandidate(1, 1);
        //  user.createUser(1, "iuli_200", "pass", "Beldiman", "Iuliana", 1, "iuliana@email.com", "yutyu", "true");
      // request.createPrivilage(1, "adauga", "adaugare utilizator");
       
    }
    
}
