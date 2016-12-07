/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.entity;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EJB_GROUP")
public class Group implements Serializable 
{
    @Id
    //@Column(name="GROUP_ID")
    private int id;
    private String name;
    
    @OneToMany
    //@JoinColumn(name="GR_ID",referencedColumnName = "GROUP_ID")
    private Collection<Privilage> privilages;
    
    public Group() {}
    
    public Group(int id, String name) {
        this.id = id;
        this.name = name;
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

    public Collection<Privilage> getPrivilages() {
        return privilages;
    }

    public void setPrivilages(Collection<Privilage> privilages) {
        this.privilages = privilages;
    }
    
  
    public void addPrivilage(Privilage privilages) {
        this.getPrivilages().add(privilages);
        
    }
    
}