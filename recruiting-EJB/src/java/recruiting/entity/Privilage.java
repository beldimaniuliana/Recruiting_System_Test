/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.entity;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Stefan
 */
@Entity
@Table(name = "EJB_Privilage")
public class Privilage implements java.io.Serializable {
    @Id
    private int id;
    private String name;
    private String discription;
   /* @OneToMany(mappedBy="privilages")
    Collection<Group> listOfPrivilages;
    */

    public Privilage(int id, String name, String discription) {
        this.id = id;
        this.name = name;
        this.discription = discription;
    }
    
      public Privilage() {
    }
      
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDiscription() {
        return discription;
    }

    public void setDiscription(String discription) {
        this.discription = discription;
    }
}
