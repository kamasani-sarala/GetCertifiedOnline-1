package com.certificate.comparator;

import java.util.Comparator;

import com.certificate.entity.Certificate;

public class SortCertificatesByName implements Comparator<Certificate>{

	@Override
	public int compare(Certificate o1, Certificate o2) {
	
		return o1.getCertificateName().compareTo(o2.getCertificateName());
	}

}