package com.SessionAttribute.Configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class dispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] mvcConfig = {webAppConfig.class};
		return mvcConfig;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr = {"/"};
		return arr;
	}
	
	
}