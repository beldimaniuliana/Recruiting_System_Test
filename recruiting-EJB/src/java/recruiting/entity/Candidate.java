/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.entity;

import java.io.Serializable;
import java.util.Collection;
import javax.ejb.EJB;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Flo
 */

@Entity
@Table(name = "EJB_Candidate")
public class Candidate implements Serializable{

    @Id
    @EJB
    private int id;
    private String first_name;
    private String last_name;
    private int id_job;


    public Candidate(int id, String first_name, String last_name, int id_job, Collection<Job> jobs) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.id_job = id_job;
        this.jobs = jobs;
    }
    
    
    public Candidate(){}
  

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getId_job() {
        return id_job;
    }

    public void setId_job(int id_job) {
        this.id_job = id_job;
    }
    
    @ManyToMany(mappedBy = "candidates")
    private Collection<Job> jobs;
    
    
    
    
    
}
