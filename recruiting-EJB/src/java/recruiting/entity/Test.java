
package recruiting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Test")
public class Test {
    @Id
    public String id;
    public String name;

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
