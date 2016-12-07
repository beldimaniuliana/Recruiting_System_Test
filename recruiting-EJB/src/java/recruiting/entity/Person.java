
package recruiting.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EJB_Person")
public class Person {
    
    @Id
    public int personId;
    public String personName;
    
    public Person() {
    } 
    public Person(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }
    
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name="pDetail_FK")//FOREIGN KEY COLUMN
    public PersonDetail pDetail;
 
    public PersonDetail getpDetail() {
        return pDetail;
    }

    public void setpDetail(PersonDetail pDetail) {
        this.pDetail = pDetail;
    }
    
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

   
    public String getPersonName() {
        return personName;
    }

    public void setPersonName(String personName) {
        this.personName = personName;
    }
   
}
