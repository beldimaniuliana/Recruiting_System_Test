
package recruitingclient;

import javax.ejb.EJB;
import recruiting.entity.Group;
import recruiting.request.Request;


public class Main {
    @EJB
    private static Request request;
    //private static Request user;

    public static void main(String[] args) {
        //request.createTest2(6, "Test1");
        //request.createTest("100", "Mama",4);
        
        request.createPerson(6, "Iuliana");
        request.createPersonDetails(1, "303030", "Engeneer", 123);
        //request.createPersonWithDetails(2, "Eu", 2, "deas", "adas", 252);
                
        
        
        
      //Functionale
        //insert tabele job, candidate + insert in tabela de legatura
        //request.createCandidate(1, "first_name", "last_name");
        //request.createJob(1, "position", "requirements", "locuri", "status", "data");
        //request.addCandidate(1, 1);
        // delete din tabelele job, candidate + tabela de legatura
        //request.removeCandidate(1);
        //request.removeJob(1);
        //request.createGroup(1, "name");
        //request.addPrivilage(1, 1);
        
        
     //Nefunctionale   
        // request.createTest("2", "Test 2");  
        // user.createUser(1, "iuli_200", "pass", "Beldiman", "Iuliana", 1, "iuliana@email.com", "yutyu", "true");
        // request.createPrivilage(1, "adauga", "adaugare utilizator");
       
    }
    
}
