
package recruiting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Test2")
public class Test2 {

    @Id
    private int id;
    private String name;
    
    public Test2() {
    }

    public Test2(int id, String name) {
       this.id = id;
       this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
}
