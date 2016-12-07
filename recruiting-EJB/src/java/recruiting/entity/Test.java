
package recruiting.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Test")
public class Test {
    @Id
    public String id;
    public String name;
    
    @OneToOne(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    public Test2 id_test2;

    public Test() {
    }

    public Test(String id, String name) {
       this.id = id;
       this.name = name;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
}
