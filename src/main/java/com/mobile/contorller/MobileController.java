package com.mobile.contorller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mobile.model.Mobile;
import com.mobile.model.MobileList;
import com.mobile.servicesImp.MobileServices;

@RestController
@RequestMapping("/api/mobile")
public class MobileController {
	
	@Autowired
	private MobileServices mobileService;
	
	@RequestMapping("/test")
	public String test() {
		return "Hello World";
	}
	
	@RequestMapping(value ="/getById/{id}", method = RequestMethod.GET)
	public Optional<Mobile> getById(@PathVariable(value="id") Long id) {
		return mobileService.getMobileById(id);
	}
	
	@RequestMapping(value="/getAllMbiles", method=RequestMethod.GET)
	public MobileList getAllMbiles() {
		MobileList listMobile = new MobileList();
		List<Mobile> mobileList =  (List<Mobile>) mobileService.getAllMobile();
		 listMobile.setMobileList(mobileList);
		 return listMobile;
	}
	
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Mobile createMobile(@RequestBody Mobile mobile) {
		return mobileService.createMobile(mobile);
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.DELETE)
	public void deleteMobile(Mobile mobile) {
		 mobileService.deleteMobile(mobile);
	}
}
