package com.qa.AccountPrizeAPI.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.AccountPrizeAPI.Service.AccountPrizeService;

@RestController
public class AccountPrizeController {
	private AccountPrizeService svc;

	public AccountPrizeService getAccountPrizeService() {
		return svc;
	}

	public AccountPrizeController(AccountPrizeService svc) {
		this.svc = svc;
	}

	@PostMapping("/checkPrize/{accountNumber}")
	public String checkPrize(@PathVariable String accountNumber) {
		return svc.checkPrize(accountNumber);
	}
}
