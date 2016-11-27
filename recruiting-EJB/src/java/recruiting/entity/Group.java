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
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Stefan
 */
@Entity
@Table(name = "EJB_Group")
public class Group implements java.io.Serializable {
   @Id
   private int id;
   private String name;
   
   private @OneToMany
   Collection<Privilage> listOfPrivilages;
   
   @OneToOne(mappedBy="Id_group")
   private User user;

    public Group(int id, String name, Collection<Privilage> listOfPrivilages, User user) {
        this.id = id;
        this.name = name;
        this.listOfPrivilages = listOfPrivilages;
        this.user = user;
    }
   
   public Group() {  }
   

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
/*
    public int getId_prvilage() {
        return id_prvilage;
    }

    public void setId_prvilage(int id_prvilage) {
        this.id_prvilage = id_prvilage;
    }
  */
}
