package com.dmall.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.dmall.beans.purchase.Provider;
import com.dmall.beans.purchase.Purchase;
import com.dmall.beans.repository.Product;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class PurchaseServiceTest {

	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private PurchaseService service;
	
	@Test
	public void testQueryProviders() {
		List<Provider> providers = service.queryProviders();
		
		log.info(providers.toString());
	}
	
	@Test
	public void testQueryProduct() {
		List<Product> products = service.queryProduct();
		
		log.info(products.toString());
	}
	
	@Test
	public void testAddPurchase() {
		String providerId = "prov-2";
		String cata = "{\"1\":\"21\", \"4\":\"33\"}";
		service.addPurchase(providerId, cata);
	}
	
	@Test
	public void testQueryPruchase() {
		List<Purchase> purchases = service.queryUnreceivedPurchase();
		
		log.info(purchases.toString());
	}
}
