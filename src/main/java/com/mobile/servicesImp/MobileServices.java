package com.mobile.servicesImp;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.model.Mobile;
import com.mobile.repo.MobileDao;

@Service
public class MobileServices {
	
	@Autowired
	private MobileDao mobileRepository;
	
	public Optional<Mobile> getMobileById(Long id) {
		return mobileRepository.findById(id);
	}
	
	public List<Mobile> getAllMobile() {
		return (List<Mobile>) mobileRepository.findAll();
	}
	
	public Mobile createMobile(Mobile mobile) {
		return mobileRepository.save(mobile);
	}
	
	public void deleteMobile(Mobile mobile) {
		mobileRepository.delete(mobile);
	}
	
}
