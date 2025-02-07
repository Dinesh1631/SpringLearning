package com.myProject.configuration;

import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.context.support.XmlWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRegistration;

//@SuppressWarnings("unused")
//public class dispatcherServletConfig implements WebApplicationInitializer {
//
//	@Override
//	public void onStartup(ServletContext servletContext) throws ServletException {
//		System.out.println("onStartup is picking by the server");
//		//Loading our webApplication context(.xml) file 
////		XmlWebApplicationContext webApplicationContext = new XmlWebApplicationContext();
////		webApplicationContext.setConfigLocation("classpath:/WEB-INF/dispatcherServlet-servlet.xml");
//		
//		//Working with annotations
//		AnnotationConfigWebApplicationContext  webApplicationContext = new AnnotationConfigWebApplicationContext();
//				 webApplicationContext.register(webIntializerConfig.class);
//
//		
//		//This dispatcherServlet will take webApplicationContext as constructor parameter. 
//		DispatcherServlet dispatcher = new DispatcherServlet(webApplicationContext);
//	
//		//add our dispatcher to servletContext.
//		ServletRegistration.Dynamic customDispatcher = servletContext.addServlet("dispatcherServlet", dispatcher);
//		
//		//setting onStartUp and url mapping to our Dispatcher.
//		customDispatcher.setLoadOnStartup(1);
//		customDispatcher.addMapping("/home.com/*");
//		
//	}

//}

/*Configure DispatcherServlet with Less code than above*/

public class dispatcherServletConfig extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@SuppressWarnings("rawtypes")
	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] mvcConfig = {webIntializerConfig.class};
		return mvcConfig;
	}

	@Override
	protected String[] getServletMappings() {
		String[] arr = {"/home.com/*"};
		return arr;
	}
	
	
}