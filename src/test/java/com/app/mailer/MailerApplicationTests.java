package com.app.mailer;

import com.app.mailer.services.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MailerApplicationTests {

	@Autowired
	private MailService mailService;

	@Test
	public void testMail() {
		mailService.sendSimpleMail("xxxxxxxxx@gmail.com","Test mail 2", "Test");
	}

	@Test
	public void testTemplateMail() {
		mailService.sendTemplateMail("xxxxxxxxx@gmail.com","Template test", "X","testTemplate");
	}

}

