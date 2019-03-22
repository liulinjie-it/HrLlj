package com.newer.HrMongoDb;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection="job")
public class Jobs {
	
	@Id
	private String id;
	@Field
	private String job;

	public Jobs() {
		// TODO Auto-generated constructor stub
	}

	public Jobs(String job) {
		super();
		this.job = job;
	}
    
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Jobs [job=" + job + "]";
	}

}
