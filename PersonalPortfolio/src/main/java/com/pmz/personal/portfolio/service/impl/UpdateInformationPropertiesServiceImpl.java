package com.pmz.personal.portfolio.service.impl;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;



import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertiesLoaderUtils;
import org.springframework.stereotype.Service;

import com.pmz.personal.portfolio.model.forms.HomeForm;
import com.pmz.personal.portfolio.service.UpdateInformationPropertiesService;

@Service
public class UpdateInformationPropertiesServiceImpl implements UpdateInformationPropertiesService {

	@Override
	public void updateProperties(HomeForm homeForm) {
		
		Properties props = new Properties();
		 
	    String propsFileName = "information.properties";
	    try {
	      //first load old one:
	      FileInputStream configStream = new FileInputStream(propsFileName);
	      props.load(configStream);
	      configStream.close();
	 
	      //modifies existing or adds new property
	      props.setProperty("information.personal.info", homeForm.getPersonalInfo());
	      
	 
	      //save modified property file
	      FileOutputStream output = new FileOutputStream(propsFileName);
	      props.store(output, "This description goes to the header of a file");
	      output.close();
	 
	    } catch (IOException ex) {
	      ex.printStackTrace();
	    }
	  }

	

}
