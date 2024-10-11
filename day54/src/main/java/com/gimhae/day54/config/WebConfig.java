package com.gimhae.day54.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class WebConfig 
	extends AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

//<servlet>
//	<servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
//</servlet>
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class[] {ServletConfig.class};
	}

//<servlet-mapping>
//	<url-pattern>/</url-pattern>
//</servlet-mapping>
	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}

}
//<!-- The definition of the Root Spring Container shared by all Servlets and Filters -->
//<context-param>
//	<param-name>contextConfigLocation</param-name>
//	<param-value>/WEB-INF/spring/root-context.xml</param-value>
//</context-param>
//
//<!-- Creates the Spring Container shared by all Servlets and Filters -->
//<listener>
//	<listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
//</listener>
//
//<!-- Processes application requests -->
