package com.qa.AccountPrizeAPI.ControllerTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.AccountPrizeAPI.Controller.AccountPrizeController;
import com.qa.AccountPrizeAPI.Service.AccountPrizeService;

@RunWith(MockitoJUnitRunner.class)
public class ControllerSuiteTest {
	private final String STRING = "test";
	@InjectMocks
	AccountPrizeController con;

	@Mock
	AccountPrizeService svc;

	@Test
	public void testCheckPrize() {
		Mockito.when(svc.checkPrize(STRING)).thenReturn(STRING);
		assertEquals(STRING, con.checkPrize(STRING));
	}

	@Test
	public void testToString() {

		assertNull(con.checkPrize(STRING));
	}
}
