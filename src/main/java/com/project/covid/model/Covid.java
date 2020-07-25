package com.project.covid.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="covid")
public class Covid {
	@Id
	@GeneratedValue
	public int id;
	public int PatientNo;
	public String Name;
	public String Email;
	public String MobileNo;
	public String DateofBirth;
	public String Gender;
	public String Address;
	public int BloodPressure;
	public float BodyTemperature;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPatientNo() {
		return PatientNo;
	}
	public void setPatientNo(int patientNo) {
		PatientNo = patientNo;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(String mobileNo) {
		MobileNo = mobileNo;
	}
	public String getDateofBirth() {
		return DateofBirth;
	}
	public void setDateofBirth(String dateofBirth) {
		DateofBirth = dateofBirth;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getBloodPressure() {
		return BloodPressure;
	}
	public void setBloodPressure(int bloodPressure) {
		BloodPressure = bloodPressure;
	}
	public float getBodyTemperature() {
		return BodyTemperature;
	}
	public void setBodyTemperature(float bodyTemperature) {
		BodyTemperature = bodyTemperature;
	}
	
	
}
