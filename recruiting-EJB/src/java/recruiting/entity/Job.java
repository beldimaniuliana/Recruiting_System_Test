/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Stefan
 */
@Entity
@Table(name = "EJB_Job")
public class Job implements java.io.Serializable {
    @Id
     int id;
     String position;
     String requirements;
     int id_candidate;
     String locuri;
     String status;
     String data;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public int getId_candidate() {
        return id_candidate;
    }

    public void setId_candidate(int id_candidate) {
        this.id_candidate = id_candidate;
    }

    public String getLocuri() {
        return locuri;
    }

    public void setLocuri(String locuri) {
        this.locuri = locuri;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
