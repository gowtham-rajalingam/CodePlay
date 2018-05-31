package service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import service.api.UtilService;

@Service
public class UtilServiceImpl implements UtilService {

//	@Autowired
//	private UtilDao utilDao;
	
//	@Override
//	@Transactional
//	public void addToLaborProductivity(LaborProdModel laborProdModel) throws ParseException {
//		// Fetching the current SYSDATE from DB to be used as end_time for Labor Prod
//		String currentTime = utilDao.getSysdate();
//		DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		laborProdModel.setEndTime(sdf.parse(currentTime));
//		
//		// Only if start time is not provided
//		if (laborProdModel.getStartTime() == null || laborProdModel.getStartTime().equals("")) {
//			laborProdModel.setStartTime(currentTime);
//		}
//		
//		utilDao.addToLaborProductivity(laborProdModel);
//	}


	@Transactional
	public Date getSysdate() {
		return new Date();
	}

}
