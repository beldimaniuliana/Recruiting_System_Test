
package recruitingclient;

import javax.ejb.EJB;
import recruiting.entity.Group;
import recruiting.entity.Person;
import recruiting.entity.PersonDetail;
import recruiting.request.Request;
import recruiting.request.RequestBean;
//testfuisdahjadfhjdsafdskjdf
public class Main {
    @EJB
    private static Request request;

    public static void main(String[] args) {
        //---FUNCTIONALE---//
        //Tabele de testare 
        //request.createTest2(90, "Test1");
        //request.createTest("100", "Mama",4);
        
        //request.createPerson(100, "Iuliana");
        //request.createPersonDetails(50, "303030", "Engeneer", 123);
        //request.createPersonWithDetails(100, "Eu", 50, "deas", "adas", 252);
          
        //insert tabele job, candidate + insert in tabela de legatura
        //request.createCandidate(1, "first_name", "last_name");
        //request.createJob(1, "position", "requirements", "locuri", "status", "data");
        //request.addCandidate(1, 1); //adaugare in tabela de legatura
            
        //delete din tabelele job, candidate + tabela de legatura
        //request.removeCandidate(1);
        //request.removeJob(1);
        
        //request.createGroup(1, "name");
        //request.addPrivilage(1, 1);
        
        //---NEFUNCTIONALE---//
        //In curs de lucru:   
        /* 
        Group group = new Group(1,"admin");
        int id = group.getId();
        request.createUser(200, "adasd", "dasd", "dads", "dasda", id, "asdasd", "dasd", "sdasd");
        */
        //request.createGroup(1,"admin");
        //request.createPrivilage(1, "adauga", "adaugare utilizator");
     
    }
}
