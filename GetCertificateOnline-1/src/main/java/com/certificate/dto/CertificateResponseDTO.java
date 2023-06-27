package com.certificate.dto;

public class CertificateResponseDTO implements MyDTO{
	private Long certificateId;
	private String certificateName;
	private String duration;
	
	public CertificateResponseDTO(Long certificateId, String certificateName, String duration) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
		this.duration = duration;
	}

	public CertificateResponseDTO() {
		super();
		
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

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	
	
	

}