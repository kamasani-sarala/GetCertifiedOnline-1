package com.certificate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.certificate.entity.Certificate;

@Repository
public interface CertificateRepository extends JpaRepository<Certificate, Long> , ICertificateCustomRepository{
	
	

}