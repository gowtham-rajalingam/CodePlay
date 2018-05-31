package controller;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import service.api.UtilService;

public class DemoController {
	
	UtilService utilService;
	
	/**
	 * This method is used to fetch the SYSDATE from the database server
	 */
	@RequestMapping(value = "/sysdate", method = RequestMethod.GET)
	public Date getSysdate() {
		return utilService.getSysdate();
	}

}
