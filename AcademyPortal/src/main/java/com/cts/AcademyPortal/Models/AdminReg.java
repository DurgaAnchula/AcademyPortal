package com.cts.AcademyPortal.Models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="admin")
public class AdminReg {
	@Id
	@Generated("assigned")
	@Column
	private int AdminId;
	@Column
	private String FirstName;
	@Column
	private String LastName;
	@Column
	private String Age; 
	@Column
	private String Gender; 
	@Column
	private String ContactNumber; 
	@Column
		private String Password;
	@Column
	private String SecretQuestion;
	@Column
	private String Answer;
	public int getAdminId() {
		return AdminId;
	}
	public void setAdminId(int adminId) {
		AdminId = adminId;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		Age = age;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(String contactnumber) {
		ContactNumber = contactnumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getSecretQuestion() {
		return SecretQuestion;
	}
	public void setSecretQuestion(String secretQuestion) {
		SecretQuestion = secretQuestion;
	}
	public String getAnswer() {
		return Answer;
	}
	public void setAnswer(String answer) {
		Answer = answer;
	}
	@Override
	public String toString() {
		return "AdminReg [AdminId=" + AdminId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age=" + Age
				+ ", Gender=" + Gender + ", ContactNumber=" + ContactNumber + ", Password=" + Password
				+ ", SecretQuestion=" + SecretQuestion + ", Answer=" + Answer + "]";
	}
		
}
