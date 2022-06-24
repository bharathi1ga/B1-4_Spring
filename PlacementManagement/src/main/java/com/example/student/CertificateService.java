package com.example.student;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CertificateService 
{
	@Autowired
	private CertificateRepository repi;  
	
	public List<Certificate> listAll() {
		return repi.findAll();
	}
	
	public void save(Certificate certificate) {
		repi.save(certificate);
	}
	public Certificate get(Integer id) {
		return repi.findById(id).get();
	}
	
	public void delete(Integer id) {
		repi.deleteById(id);
	}

	

}
