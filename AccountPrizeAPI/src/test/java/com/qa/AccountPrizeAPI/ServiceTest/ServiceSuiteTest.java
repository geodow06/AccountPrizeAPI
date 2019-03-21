package com.qa.AccountPrizeAPI.ServiceTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.AccountPrizeAPI.Service.AccountPrizeChecker;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = AccountPrizeChecker.class)
public class ServiceSuiteTest {
	private final String STRING = "test";

	@Autowired
	AccountPrizeChecker svc;

	@Test
	public void testCheckPrize() {

		assertEquals("", svc.checkPrize(STRING));
	}

}
