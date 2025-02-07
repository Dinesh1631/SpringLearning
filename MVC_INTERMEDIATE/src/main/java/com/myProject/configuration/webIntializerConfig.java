package com.myProject.configuration;

import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.format.FormatterRegistry;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.myProject.Formatter.currencyFormatter;
import com.myProject.Formatter.phoneNumberFormatter;

@EnableWebMvc
@ComponentScan(basePackages = "com.myProject")
@Configuration
@PropertySource("classpath:email.properties")
public class webIntializerConfig implements WebMvcConfigurer {
	@Autowired
	private Environment env;
	@Bean()
	InternalResourceViewResolver getView() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/view/");
		resolver.setSuffix(".jsp");
		return resolver;
	}

	@Bean
	public LocalValidatorFactoryBean validator() {
		return new LocalValidatorFactoryBean();
	}

	public void addFormatters(FormatterRegistry registry) {
		phoneNumberFormatter formatter = new phoneNumberFormatter();
		currencyFormatter currencyFormatter = new currencyFormatter();
		registry.addFormatter(formatter);
		registry.addFormatter(currencyFormatter);
	}

	@Bean
	public JavaMailSender setMailSender() {
		JavaMailSenderImpl mail = new JavaMailSenderImpl();
		//System.out.println("This retrived from the properties file : "+env.getProperty("email.host"));
		mail.setHost(env.getProperty("email.host"));
		mail.setUsername(env.getProperty("email.userName"));
		mail.setPassword(env.getProperty("email.password"));
		mail.setPort(Integer.parseInt(env.getProperty("email.port")));
		
		
		Properties mailProperties = new Properties();
		mailProperties.put("mail.smtp.starttls.enable", true);
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		mailProperties.put("mail.smtp.auth", "true");
		mailProperties.put("mail.smtp.starttls.enable", "true");
		mailProperties.put("mail.smtp.host", "smtp.gmail.com");
		mailProperties.put("mail.smtp.port", "587");
		mailProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
		
		//SmailProperties.put("mail.debug", "true");
		
		mail.setJavaMailProperties(mailProperties);
		
		return mail;

	}

}
