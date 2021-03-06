package com.newer.HrMongoDb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="hr1")
public class HR {
	@Id
	private String id;
	@Field
	private int Hrid;
	@Field
	private String name;
	@Field
	private String job;
	@Field
	private String phone;
    
	public HR() {
		// TODO Auto-generated constructor stub
	}
	
	public HR(int hrid, String name, String job, String phone) {
		super();
		this.Hrid = hrid;
		this.name = name;
		this.job = job;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getHrid() {
		return Hrid;
	}

	public void setHrid(int hrid) {
		this.Hrid = hrid;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Hr [id=" + id + ", hrid=" + Hrid + ", name=" + name + ", job=" + job + ", phone=" + phone + "]";
	}

}
