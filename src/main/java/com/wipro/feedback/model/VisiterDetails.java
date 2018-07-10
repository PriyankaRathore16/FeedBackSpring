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

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name = "visiter_details")
public class VisiterDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_Id")
	private int user_Id;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "visiter_gid",nullable=false)
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

	public VisiterDetails() {
	}

	public Visiter getVisiter() {
		return visiter;
	}

	public void setVisiter(Visiter visiter) {
		this.visiter = visiter;
	}

	public VisiterDetails(int user_Id, String fname, String lname, String email, String designation, String company,
			String reason, Visiter visiter) {
		this.user_Id = user_Id;
		this.visiter = visiter;
		this.fname = fname;
		this.lname = lname;
		this.email = email;
		this.designation = designation;
		this.company = company;
		this.reason = reason;
	}

	public int getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
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

	@Override
	public String toString() {
		return "VisiterDetails [user_Id=" + user_Id + ", visiter=" + visiter + ", fname=" + fname + ", lname=" + lname
				+ ", email=" + email + ", designation=" + designation + ", company=" + company + ", reason=" + reason
				+ "]";
	}}
//First save the visitor then add the address or details...i.e when you are getting json req .addk ain the visiter tab;e because mapping will follow table data. wait!!!}
