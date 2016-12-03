package recruiting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "EJB_User")
public class User {
    @Id
    private int id;
    private String username;
    private String password;
    private String first_name;
    private String last_name;
    @OneToOne
    private Group Id_group;
    private String email;
    private String phone;
    private String active;

    

    public User(int id, String username, String password, String first_name, String last_name, Group Id_group, String email, String phone, String active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.first_name = first_name;
        this.last_name = last_name;
        this.Id_group = Id_group;
        this.email = email;
        this.phone = phone;
        this.active = active;
    }
    
    public User() {
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
/*
    public int getId_group() {
        return id_group;
    }
    public void setId_group(int id_group) {
        this.id_group = id_group;
    }
*/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }   
     
}