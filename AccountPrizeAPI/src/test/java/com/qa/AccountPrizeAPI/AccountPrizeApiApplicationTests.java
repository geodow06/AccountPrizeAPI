package com.qa.AccountPrizeAPI;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.qa.AccountPrizeAPI.ControllerTest.ControllerSuiteTest;
import com.qa.AccountPrizeAPI.ServiceTest.ServiceSuiteTest;





@RunWith(Suite.class) 
@SuiteClasses({ServiceSuiteTest.class,ControllerSuiteTest.class}) 
public class AccountPrizeApiApplicationTests {



}
