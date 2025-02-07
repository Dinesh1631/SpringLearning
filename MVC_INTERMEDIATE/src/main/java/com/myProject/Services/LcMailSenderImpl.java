package com.myProject.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class LcMailSenderImpl implements LcMailSender {
	@Autowired
	private JavaMailSender mailSender;

	public void sendMail(String userMail, String result, String userName, String crushName) throws Exception {
		MimeMessage message = mailSender.createMimeMessage();
		MimeMessageHelper helper = new MimeMessageHelper(message, true); // 'true' enables multipart (for HTML)

		String link = "http://localhost:8080/MVC_INTERMEDIATE/home.com/feedback";
		// Set the email details
		helper.setTo(userMail);
		helper.setSubject("The Love Calculator Results");

		// Create an HTML content for the email
		String htmlContent = "<html><body>" + "<p>Hello " + userName + ",</p>"
				+ "<p>We have calculated the result for the love between you and " + crushName + "!</p>"
				+ "<p>The result is: <strong>" + result + "</strong></p>"
				+ "<p>Click the link below to give your feedback:</p>" + "<p><a href='" + link
				+ "'>Visit Website</a></p>" + "</body></html>";

		// Set the email content (HTML content)
		helper.setText(htmlContent, true); // 'true' indicates that the content is HTML

		message.setContent(htmlContent, "text/html");

		// Send the email
		mailSender.send(message);
	}

	@Override
	public void feedBackMailResoponce(String userName, String userMail) {
		SimpleMailMessage message = new SimpleMailMessage();
		message.setTo(userMail);
		message.setSubject("Appreication for your feedback");
		message.setText("Thank you " + userName + " for your Valuble feedback");
		mailSender.send(message);
	}
}
