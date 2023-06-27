package com.certificate.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.certificate.dto.CertificateResponseDTO;
import com.certificate.dto.ErrorDTO;
import com.certificate.dto.MyDTO;
import com.certificate.entity.Certificate;
import com.certificate.service.CertificateService;
import com.certificate.util.CertificateDTOConverter;

@RestController
@RequestMapping("/certificate")
public class CertificateController {
	
	@Autowired
    CertificateService certificateService;

 

    @Autowired
    CertificateDTOConverter dtoConverter;

 

    @PostMapping("/addcertificate")
    public ResponseEntity<MyDTO> addCertificate(@RequestBody Certificate certificate) {
        try {
            Certificate savedCertificate = certificateService.addCertificate(certificate);
            CertificateResponseDTO dto = CertificateDTOConverter.convertToDTO(savedCertificate);
            return new ResponseEntity<MyDTO>(dto, HttpStatus.OK);
        } catch (Exception e) {
            ErrorDTO errorDTO = new ErrorDTO(e.getMessage());
            return new ResponseEntity<MyDTO>(errorDTO, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

 

    @DeleteMapping("/delete/{certificateId}")
    public ResponseEntity<String> deleteMedicine(@PathVariable Long certificateId) {
        try {
            String deletedCertificate = certificateService.deleteCertificate(certificateId);
            String responseMsg = "deleted the certificate selected";
            return new ResponseEntity<String>(responseMsg, HttpStatus.OK);
        } catch (Exception e) {
            String errorMsg = "Contact concerned manager \n" + e;
            return new ResponseEntity<String>(errorMsg, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

 

    @PutMapping("/update")
    public Certificate updateCertificate(@RequestBody Certificate certificateDetails) throws Exception {
        return certificateService.updateCertificate(certificateDetails);
    }

    @GetMapping("/certificateid/{certificateId}")
    public Certificate getCertificateById(@PathVariable Long certificateId) throws Exception {
        return certificateService.getById(certificateId);
    }


 

    @GetMapping("/certificates")
    public List<Certificate> getAllCertificates() {
        try { 
            List<Certificate> allExtractedCertificates = certificateService.getAllCertificates();
            return allExtractedCertificates;
        }catch (Exception e) {
            System.out.println(e);
        }
        return null;
}

    @GetMapping("/sortbyname")
    public List<Certificate> sortByName() throws Exception{
        return certificateService.sortCertificatesByName();
    }

}