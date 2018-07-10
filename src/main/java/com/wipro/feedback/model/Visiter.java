package com.wipro.feedback.model;

import java.sql.Date;
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

@Component
@Entity
@Table(name = "visiter_group")
public class Visiter {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int visiter_gid;//never use underscore
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

	@OneToMany(mappedBy = "visiter", fetch=FetchType.LAZY, cascade= CascadeType.ALL)
	private Set<VisiterDetails> visiterDetails;

	public Visiter() {
	}

	public Visiter(int visiter_gid, String reason, String who, String toTime, String fromTime, Date date,
			Set<VisiterDetails> visiterDetails) {
		
		this.visiter_gid = visiter_gid;
		this.reason = reason;
		this.who = who;
		this.toTime = toTime;
		this.fromTime = fromTime;
		this.date = date;
		this.visiterDetails = visiterDetails;
	}

	public int getVisiter_gid() {
		return visiter_gid;
	}

	public void setVisiter_gid(int visiter_gid) {
		this.visiter_gid = visiter_gid;
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

	public Set<VisiterDetails> getVisiterDetails() {
		return visiterDetails;
	}

	public void setVisiterDetails(Set<VisiterDetails> visiterDetails) {
		for (VisiterDetails vd : visiterDetails) {
			vd.setVisiter(new Visiter());
			vd.getVisiter().setVisiter_gid(visiter_gid);
		}
		this.visiterDetails = visiterDetails;
	}

	@Override
	public String toString() {
		return "Visiter [visiter_gid=" + visiter_gid + ", reason=" + reason + ", who=" + who + ", toTime=" + toTime
				+ ", fromTime=" + fromTime + ", date=" + date + ", visiterDetails=" + visiterDetails + "]";
	}

}
