
package recruiting.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EJB_PersonDetail")
public class PersonDetail {
  
    public int personDetailId;
    public String zipCode;
    public String job;
    public double income;

    public PersonDetail() {
    }
    
    public PersonDetail(int personDetailId, String zipCode, String job, double income){
        this.personDetailId = personDetailId;
        this.zipCode = zipCode;
        this.job = job;
        this.income = income;
    }
    
    @Column(name="detailId_PK")//PRIMARY KEY
    @Id
    public int getPersonDetailId() {
        return personDetailId;
    }

    public void setPersonDetailId(int personDetailId) {
        this.personDetailId = personDetailId;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public double getIncome() {
        return income;
    }

    public void setIncome(double income) {
        this.income = income;
    }
}
