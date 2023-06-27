package com.certificate.util;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.certificate.dto.CertificateResponseDTO;
import com.certificate.entity.Certificate;

@Component
@Scope("singleton")
public class CertificateDTOConverter {
	
	public static CertificateResponseDTO convertToDTO(Certificate certificate) {
		return new CertificateResponseDTO(certificate.getCertificateId(),certificate.getCertificateName(),certificate.getDuration());
		
	}
	

}