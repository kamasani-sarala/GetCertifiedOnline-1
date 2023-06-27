package com.certificate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.certificate.entity.Certificate;

@Service
public interface CertificateService {
	
	public Certificate addCertificate(Certificate certificate) throws Exception;
	public Certificate getById(Long certificateId) throws Exception;
	public String deleteCertificate(long certificateId) throws Exception;
	public Certificate updateCertificate(Certificate certificate) throws Exception;
	public List<Certificate> getAllCertificates() throws Exception;
	public List<Certificate> sortCertificatesByName() throws Exception;
	

}