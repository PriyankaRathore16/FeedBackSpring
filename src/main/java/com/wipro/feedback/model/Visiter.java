package com.wipro.feedback.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "visiter_group")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Visiter {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long vistorId;
    @Column
    private String reason;
    @Column
    private String who;
    @Column
    private String toTime;
    @Column
    private String fromTime;
    @Column
    private Date date;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "visiter")
    private List<VisiterDetails> visiterDetails=new ArrayList<>();

    public Visiter() {
    }

    @Override
    public String toString() {
        return "Visiter [visiter_gid=" + vistorId + ", reason=" + reason + ", who=" + who + ", toTime=" + toTime
                + ", fromTime=" + fromTime + ", date=" + date + ", visiterDetails=" + visiterDetails + "]";
    }

    public long getVistorId() {
        return vistorId;
    }

    public void setVistorId(long vistorId) {
        this.vistorId = vistorId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }

    public String getToTime() {
        return toTime;
    }

    public void setToTime(String toTime) {
        this.toTime = toTime;
    }

    public String getFromTime() {
        return fromTime;
    }

    public void setFromTime(String fromTime) {
        this.fromTime = fromTime;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<VisiterDetails> getVisiterDetails() {
        return visiterDetails;
    }

   /* public void setVisiterDetails(List<VisiterDetails> visiterDetails) {
        this.visiterDetails = visiterDetails;
    }*/

    

}
