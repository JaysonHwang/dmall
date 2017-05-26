package com.dmall.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dmall.beans.Client;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class ClientServiceTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private ClientService service;
	
	@Test
	public void testCheckUser() {
		String username = "wch853";
		String password = "12345";
		
		Client client = service.checkUser(username, password);
		
		log.info((client == null) + "");
	}
}