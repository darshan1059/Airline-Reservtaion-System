package com.app.util;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;

import com.app.dto.Contact;
import com.app.dto.PropertyFileReader;
import com.app.pojos.Customer;
import com.app.pojos.FlightDetails;
import com.app.pojos.TicketBooking;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;

@Service
public class EmailService {
	@Autowired
	private JavaMailSender mailSender;
	@Autowired
	private Configuration configuration;
	
	@Autowired
	private PropertyFileReader propertyFileReader;

	public void sendMail(TicketBooking ticket, FlightDetails flight,
			Map<String, String> model) throws IOException {
		String to = ticket.getEmail();
		String subject = "Email From JMK Airlines";
		String body = "This is email body";
		String fileToAttach = propertyFileReader.getDirPlace() + flight.getFlightName() + ticket.getBookingId() + ".pdf";
		model.put("body", body);
		FileSystemResource file = new FileSystemResource(new File(fileToAttach));
		MimeMessage message = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			Template template = configuration.getTemplate("email.ftl");
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			helper.setTo(to);
			helper.setFrom(propertyFileReader.getEmail());
			helper.setSubject(subject);
			helper.setText(html, true);
			helper.addAttachment(flight.getFlightName() + ".pdf", file);
			mailSender.send(message);
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
		}
	}
	
	
	public void performOtpOperation(Customer customer) {
		Map<String, String> model = new HashMap<>();
		model.put("customerName", customer.getFirstName());
		model.put("OTP", customer.getOneTimePassword());
		String subject = "Verify Your Email";
//		String body = "Email Verification OTP";
		MimeMessage message = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			Template template = configuration.getTemplate("otp.ftl");
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			helper.setTo(customer.getEmailId());
			helper.setFrom(propertyFileReader.getEmail());
			helper.setSubject(subject);
			helper.setText(html, true);
			mailSender.send(message);
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
		}
		
	}
	
	public Boolean sendEmailContact(Contact contact) {
		Map<String, String> model = new HashMap<>();
		model.put("customerName", contact.getFirstName()+" " + contact.getLastName());
		model.put("email", contact.getEmail());
		model.put("subject", contact.getSubject());
		String subject = "Message From " + contact.getFirstName();
		MimeMessage message = mailSender.createMimeMessage();
		try {
			MimeMessageHelper helper = new MimeMessageHelper(message, MimeMessageHelper.MULTIPART_MODE_MIXED_RELATED,
					StandardCharsets.UTF_8.name());
			Template template = configuration.getTemplate("contactmessage.ftl");
			String html = FreeMarkerTemplateUtils.processTemplateIntoString(template, model);
			helper.setTo("xxx@gmail.com");
			helper.setFrom(propertyFileReader.getEmail());
			helper.setSubject(subject);
			helper.setText(html, true);
			mailSender.send(message);
			return true;
		} catch (MessagingException | IOException | TemplateException e) {
			e.printStackTrace();
			return false;
		}
	}
}