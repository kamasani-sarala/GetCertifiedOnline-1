package com.certificate.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

 

import java.util.ArrayList;
import java.util.List;

 

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.BDDMockito;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

 

import com.certificate.entity.Certificate;
import com.certificate.repository.CertificateRepository;

 

@SpringBootTest
public class certificate {

    @Mock
    CertificateRepository certificateRepository;

    @InjectMocks
    CertificateServiceImpl certificateService;

    @Test
    @DisplayName("Test to verify al medicines returned")
    void testGetAllMedicines() throws Exception{

    	Certificate certificate1 = new Certificate(1L, "Java",1," 1 month");

        Certificate certificate2 = new Certificate(1L, "Java",1," 1 month");

        List<Certificate> sampleOutput = new ArrayList<>();
        sampleOutput.add(certificate1);
        sampleOutput.add(certificate2);

        BDDMockito.given(certificateService.getAllCertificates()).willReturn(sampleOutput);

        List<Certificate> actualOutput = certificateService.getAllCertificates();

        assertNotNull(actualOutput);
        assertThat(actualOutput.size()).isGreaterThan(0);
        assertIterableEquals(sampleOutput, actualOutput);

    }

    @Test
    @DisplayName("Test to verify the insert operation")
    void testAddMedicine() throws Exception{

    	Certificate sampleInput = new Certificate(1L, "Java",1," 1 month");
    	Certificate expectedOutput = new Certificate(1L, "Java",1," 1 month");

        BDDMockito.given(certificateService.addCertificate(sampleInput)).willReturn(expectedOutput);

        Certificate actualOutput = certificateService.addCertificate(sampleInput);

        assertEquals(expectedOutput,actualOutput);
    }


 

}