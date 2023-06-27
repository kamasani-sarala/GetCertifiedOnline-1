package com.certificate.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.certificate.comparator.SortCertificatesByName;
import com.certificate.entity.Certificate;
import com.certificate.repository.CertificateRepository;

 

@Service
public class CertificateServiceImpl implements CertificateService{

    @Autowired
    private CertificateRepository certificateRepository;


 

    @Override
    public Certificate addCertificate(Certificate certificate) throws Exception {
        Certificate savedCertificate = certificateRepository.save(certificate);
        if(savedCertificate != null) {
            return savedCertificate;
        }
        else
        return null;
    }

 

    @Override
    public Certificate getById(Long certificateId) throws Exception {

        return certificateRepository.findById(certificateId).get();
    }

 

    @Override
    public String deleteCertificate(long certificateId) throws Exception {
        certificateRepository.deleteById(certificateId);
        return "certificate with id "+certificateId+"has deleted";
    }

 

    @Override
    public Certificate updateCertificate(Certificate certificate) throws Exception {
        Certificate updatedCertificate = certificateRepository.save(certificate);
        return updatedCertificate;
    }

 

    @Override
    public List<Certificate> getAllCertificates() throws Exception {
        List<Certificate> allCertificates = certificateRepository.findAll();
        return allCertificates;
    }

 

    @Override
    public List<Certificate> sortCertificatesByName() throws Exception {
        List<Certificate> list = certificateRepository.findAll();
        List<Certificate> certificate = new ArrayList<>();
        Collections.sort(list , new SortCertificatesByName());
        return list;
    }

 


}