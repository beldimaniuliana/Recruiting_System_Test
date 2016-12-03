/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.entity;

import java.util.Collection;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

/**
 *
 * @author Stefan
 */
@Entity
@Table(name = "EJB_Job")
public class Job implements java.io.Serializable {
  
     int id;
     private String position;
     private String requirements;
     private String locuri;
     private String status;
     private String data;
    
     
     public Job() {
    }
     
     
      public Job(int id, String position, String requirements, String locuri, String status, String data) {
        this.id = id;
        this.position = position;
        this.requirements = requirements;
        this.locuri = locuri;
        this.status = status;
        this.data = data;
    }

     
    
   
     @Id
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
     
    
    
    private Collection<Candidate> candidates;      
    @ManyToMany
    @JoinTable(name="JOB_CANDIDATE",joinColumns=@JoinColumn(name="id_job"),
               inverseJoinColumns=@JoinColumn(name="id_privilage"))
    public Collection<Candidate> getCandidates() {
        return candidates;
     }

    public void setCandidates(Collection<Candidate> candidates) {
        this.candidates = candidates;
    }

    
      public void addCandidate(Candidate candidate) {
         this.getCandidates().add(candidate);
        
    }
        
     
  
}
