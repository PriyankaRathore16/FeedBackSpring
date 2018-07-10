package com.wipro.feedback.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "visiter_details")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class VisiterDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userId")
    private int userId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vistorId")
    public Visiter visiter;
    @Column(name = "fname")
    private String fname;
    @Column(name = "lname")
    private String lname;
    @Column(name = "email")
    private String email;
    @Column(name = "designation")
    private String designation;
    @Column(name = "company")
    private String company;
    @Column(name = "reason")
    private String reason;
    @Transient
    private long visiterId;

    public VisiterDetails() {
    }

    @JsonIgnore
    public Visiter getVisiter() {
        return visiter;
    }

    public void setVisiter(Visiter visiter) {

        this.visiter = visiter;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public long getVisiterId() {
        return visiter.getVistorId();
    }

   

    @Override
    public String toString() {
        return "VisiterDetails [userId=" + userId + ", visiter=" + visiter + ", fname=" + fname + ", lname=" + lname
                + ", email=" + email + ", designation=" + designation + ", company=" + company + ", reason=" + reason
                + "]";
    }

}
// First save the visitor then add the address or details...i.e when you are
// getting json req .addk ain the visiter tab;e because mapping will follow
// table data. wait!!!}
