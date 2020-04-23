package com.cts.AcademyPortal.Models;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
@Entity
@Table(name="faculty")
public class FacultyReg {

	@SequenceGenerator(name = "facultySeq",initialValue = 200, allocationSize = 1, sequenceName = "FACULTY_SEQ")
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "facultySeq")
	@Column
	
	private int FacultyId;
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
	private String specialization;
	@Column
	private String SecretQuestion;
	@Column
	private String Answer;
	public int getFacultyId() {
		return FacultyId;
	}
	public void setFacultyId(int facultyId) {
		FacultyId = facultyId;
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
	public void setContactNumber(String contactNumber) {
		ContactNumber = contactNumber;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
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
		return "FacultyReg [FacultyId=" + FacultyId + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Age="
				+ Age + ", Gender=" + Gender + ", ContactNumber=" + ContactNumber + ", Password=" + Password
				+ ", specialization=" + specialization + ", SecretQuestion=" + SecretQuestion + ", Answer=" + Answer
				+ "]";
	}
	
}
