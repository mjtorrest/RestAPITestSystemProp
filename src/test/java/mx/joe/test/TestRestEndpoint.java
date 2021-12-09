package mx.joe.test;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

import mx.joe.client.ConsumerService;

public class TestRestEndpoint {

	@Test
	public void propertySystemNotNull_then_status200() throws IOException{
		
		String osName = "os.name";
		String javaHome = "java.home";
		String javaVendor = "java.vendor";
		String userHome = "user.home";
		String randomProperty1 = "x.prop";
		
		//test if OS name is set
		assertEquals(200,ConsumerService.consumeServicePropertySystem(osName));
		//test if java home has a value set.
		assertEquals(200,ConsumerService.consumeServicePropertySystem(javaHome));
		//test if java vendor has a value set.
		assertEquals(200,ConsumerService.consumeServicePropertySystem(javaVendor));
		//test if user home has a value set.
		assertEquals(200,ConsumerService.consumeServicePropertySystem(userHome));
		//test if a random property has a value set.
		assertEquals(200,ConsumerService.consumeServicePropertySystem(randomProperty1));
	}

}
