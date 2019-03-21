package com.newer.HrMySql;

/**
 * 工作人员信息实体类
 * @author Administrator
 *
 */

//@Document(collection="HR")
public class Hr {
//	@Id
    private String id;
//	@Field
	private int Hrid;
//	@Field
	private String name;
//	@Field
	private String job;
//	@Field
	private String phone;

	public Hr() {
		// TODO Auto-generated constructor stub
	}

	public Hr(int hrid, String name, String job, String phone) {
		super();
		Hrid = hrid;
		this.name = name;
		this.job = job;
		this.phone = phone;
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
		Hrid = hrid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "HR [id=" + id + ", Hrid=" + Hrid + ", name=" + name + ", job=" + job + ", phone=" + phone + "]";
	}

}