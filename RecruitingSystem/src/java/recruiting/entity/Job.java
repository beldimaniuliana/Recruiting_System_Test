/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recruiting.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Beldiman Iuliana
 */
@Entity
@Table(name = "EJB_JOB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Job.findAll", query = "SELECT j FROM Job j")
    , @NamedQuery(name = "Job.findById", query = "SELECT j FROM Job j WHERE j.id = :id")
    , @NamedQuery(name = "Job.findByPosition", query = "SELECT j FROM Job j WHERE j.position = :position")
    , @NamedQuery(name = "Job.findByRequirements", query = "SELECT j FROM Job j WHERE j.requirements = :requirements")
    , @NamedQuery(name = "Job.findByDate", query = "SELECT j FROM Job j WHERE j.date = :date")
    , @NamedQuery(name = "Job.findByNoSpot", query = "SELECT j FROM Job j WHERE j.noSpot = :noSpot")})
public class Job implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "position")
    private String position;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "requirements")
    private String requirements;
    @Basic(optional = false)
    @NotNull
    @Column(name = "date")
    @Temporal(TemporalType.DATE)
    private Date date;
    @Basic(optional = false)
    @NotNull
    @Column(name = "no_spot")
    private int noSpot;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idJob")
    private List<Candidate> candidateList;
    @JoinColumn(name = "id_candidate", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Candidate idCandidate;
    @JoinColumn(name = "id_status", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Status idStatus;

    public Job() {
    }

    public Job(Integer id) {
        this.id = id;
    }

    public Job(Integer id, String position, String requirements, Date date, int noSpot) {
        this.id = id;
        this.position = position;
        this.requirements = requirements;
        this.date = date;
        this.noSpot = noSpot;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNoSpot() {
        return noSpot;
    }

    public void setNoSpot(int noSpot) {
        this.noSpot = noSpot;
    }

    @XmlTransient
    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public void setCandidateList(List<Candidate> candidateList) {
        this.candidateList = candidateList;
    }

    public Candidate getIdCandidate() {
        return idCandidate;
    }

    public void setIdCandidate(Candidate idCandidate) {
        this.idCandidate = idCandidate;
    }

    public Status getIdStatus() {
        return idStatus;
    }

    public void setIdStatus(Status idStatus) {
        this.idStatus = idStatus;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Job)) {
            return false;
        }
        Job other = (Job) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "recruiting.entity.Job[ id=" + id + " ]";
    }
    
}
