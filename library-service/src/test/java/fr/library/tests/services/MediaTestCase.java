package fr.library.tests.services;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.uni.institute.library.business.inventory.Title;


@ContextConfiguration(locations = {"classpath:test-beans.xml" }) // annotation Spring
@RunWith(SpringJUnit4ClassRunner.class)
public class MediaTestCase {
	
	private static Logger logger = Logger.getLogger(MediaTestCase.class);
	@Resource(name="media")
	private Title media;
	
	@Before
	public void setUp() throws Exception {
		logger.info("Init de jeu de donnees ");
		logger.debug("media ");
		
	}

	@After
	
	public void tearDown() throws Exception {
		logger.info("supression de jeu de donnees ");
		media = null;
	}

	@Test
	public void testGetType() {
		logger.info("Test media type");
		assertEquals("Jenkins", media.getName());
	}

}
