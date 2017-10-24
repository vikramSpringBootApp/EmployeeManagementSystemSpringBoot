package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Employee {

	@Id
	private long empId;
	
	@NotEmpty
	@Column
	private String firstName;
	
	@NotEmpty
	@Column
	private String lastName;
	
	@NotEmpty
	@Column
	private String DOB;
	
	@NotEmpty
	@Column
	private String address;
	
	@NotEmpty
	@Column
	private String contactNo;
	
	@NotEmpty
	@Column
	private String certificateName;
	
	@NotEmpty
	@Column
	private String position;
	
	@NotNull
	@Column
	private float percentage;
	
	/*@NotEmpty
	@Column
	private String percent=null;*/
	
	public Employee() {
	}
	                              
	
	

	public Employee(long empId, String firstName, String lastName, String dOB, String address, String contactNo,
			String certificateName, String position, float percentage) {
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.address = address;
		this.contactNo = contactNo;
		this.certificateName = certificateName;
		this.position = position;
		this.percentage = percentage;
	}




	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	
	public long getEmpId() {
		return empId;
	}


	public void setEmpId(long empId) {
		this.empId = empId;
	}



	public float getPercentage() {
		return percentage;
	}




	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}




	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", address=" + address + ", contactNo=" + contactNo + ", certificateName=" + certificateName
				+ ", position=" + position + ", percentage=" + percentage + "]";
	}




	
}
