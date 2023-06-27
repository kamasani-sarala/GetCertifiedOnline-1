package com.certificate.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "certificates")
public class Certificate {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long certificateId;
	private String certificateName;
	private Integer noOfCertificates;
	private String duration;
	
	public Certificate(Long certificateId, String certificateName, Integer noOfCertificates, String duration) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
		this.noOfCertificates = noOfCertificates;
		this.duration = duration;
	}
	
	public Certificate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Long getCertificateId() {
		return certificateId;
	}
	public void setCertificateId(Long certificateId) {
		this.certificateId = certificateId;
	}
	
	public String getCertificateName() {
		return certificateName;
	}
	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}
	
	public Integer getNoOfCertificates() {
		return noOfCertificates;
	}
	public void setNoOfCertificates(Integer noOfCertificates) {
		this.noOfCertificates = noOfCertificates;
	}
	
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	

}