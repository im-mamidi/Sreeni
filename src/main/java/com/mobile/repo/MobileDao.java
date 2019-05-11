package com.mobile.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.mobile.model.Mobile;

@Repository
public interface MobileDao extends CrudRepository<Mobile, Long>{
	

}
